/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.goemergency.dao;

import br.com.goemergency.model.Endereco;
import br.com.goemergency.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class EnderecoDAOImpl implements GenericDAO {

    private Connection conn;

    public EnderecoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Integer cadastrar(Object object) {
        PreparedStatement stmt = null;
         ResultSet rs = null;
        Integer idEndereco = null;
        Endereco oEndereco = (Endereco) object;
        String sql = "INSERT INTO Endereco("
                + " cep, rua, numero, bairro, cidade, estado)"
                + " VALUES(?, ?, ?, ?, ?, ?) RETURNING (idendereco)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oEndereco.getCep());
            stmt.setString(2, oEndereco.getRua());
            stmt.setInt(3, oEndereco.getNumero());
            stmt.setString(4, oEndereco.getBairro());
            stmt.setString(5, oEndereco.getCidade());
            stmt.setString(6, oEndereco.getEstado());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                idEndereco = rs.getInt("idEndereco");
            }
        } catch (SQLException ex) {//Caso dê problema
            System.out.println("Problemas ao cadastrar Endereco \n Erro:" + ex.getMessage());
            ex.printStackTrace();
            //Se der algum erro retornar falso.
        } finally {//Executa de qualquer forma       
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão \n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return idEndereco;
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT idEndereco, rua, numero, bairro, cep, nomecidade, nomeEstado"
                + " from estado, Endereco, cidade "
                + " where cidade.idestado = estado.idestado and Endereco.idcidade = cidade.idcidade ";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Endereco oEndereco = new Endereco();
                oEndereco.setIdEndereco(rs.getInt("idEndereco"));
                oEndereco.setRua(rs.getString("rua"));
                oEndereco.setNumero(rs.getInt("numero"));
                oEndereco.setBairro(rs.getString("bairro"));
                oEndereco.setCep(rs.getString("cep"));
                //Adicionar construtor com os atributos especificos na classe Cidade
//                oEndereco.setCidade(new Cidade(rs.getString("nomeCidade")));
//                oEndereco.setEstado(new Estado(rs.getString("nomeEstado")));
                resultado.add(oEndereco);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Endereco \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            //Fecha a conexão
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar parametros de conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        Endereco oEndereco = null;
        String sql = "update FROM Endereco set inactivatedAt = current_timestamp, updatedat = current_timestamp WHERE idEndereco=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1,  new java.sql.Date (oEndereco.getInactivatedAt().getTime()));
            stmt.setDate(2,  new java.sql.Date (oEndereco.getUpdatedat().getTime()));
            stmt.setInt(3, oEndereco.getIdEndereco());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro no Excluir EnderecoDAOImpl: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Endereco oEndereco = null;

        String sql = " SELECT idEndereco, rua, bairro, cep, numero, nomecidade,cidade.idcidade, nomestado,"
                + " estado.idestado"
                + " FROM cidade, Endereco, estado"
                + " WHERE Endereco.idcidade = cidade.idcidade and cidade.idestado = estado.idestado"
                + " AND Endereco.idEndereco = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            if (rs.next()) {
                oEndereco = new Endereco();
                oEndereco.setIdEndereco(rs.getInt("idEndereco"));
                oEndereco.setRua(rs.getString("rua"));
                oEndereco.setBairro(rs.getString("bairro"));
                oEndereco.setCep(rs.getString("cep"));
                oEndereco.setNumero(rs.getInt("numero"));
//                //Adicionar construtor com os atributos especificos na classe Cidade
////                Cidade oCidade = new Cidade(rs.getInt("idCidade"),
////                        rs.getString("nomeCidade"));
////                oEndereco.setCidade(oCidade);
////                Estado oEstado = new Estado(rs.getInt("idEstado"),
//                        rs.getString("siglaestado"),
//                        rs.getString("nomeEstado"));
//                oEndereco.setEstado(oEstado);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Carregar EnderecoDAOImpl"
                    + " \n Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar Conexão: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oEndereco;
    }

    @Override
    public Boolean alterar(Object object) {
        Endereco oEndereco = (Endereco) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE Endereco SET"
                + " rua = ?, bairro = ?, cep = ?, numero = ?,"
                + " idcidade = ?, idestado = ?, updatedat = current_timestamp"
                + " WHERE idEndereco = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oEndereco.getRua());
            stmt.setString(2, oEndereco.getBairro());
            stmt.setString(3, oEndereco.getCep());
            stmt.setInt(4, oEndereco.getNumero());
            //parametro chave
//            stmt.setInt(5, oEndereco.getCidade().getIdCidade());
//            stmt.setInt(6, oEndereco.getEstado().getIdEstado());
            stmt.setDate(7,  new java.sql.Date (oEndereco.getUpdatedat().getTime()));
            stmt.setInt(8, oEndereco.getIdEndereco());
            stmt.execute();
            return true;
            //Dicaaaaaa copiar do catch para baixo
        } catch (Exception ex) {
            System.out.println("Erro ao alterar EnderecoDAOImpl \n Erro: " + ex.getMessage());
            ex.printStackTrace();//detalha o erro
            return false;
        } finally {
            //é executado de qualquer forma //Obrigatoriamente devemos fechar a conexão e parametros
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar parametros de conexão Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
