/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.goemergency.dao;

import br.com.goemergency.model.Mensagens;
import br.com.goemergency.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author windows
 */
public class MensagensDAOImpl {
    
    Connection conn;

    public MensagensDAOImpl() throws Exception {
        try {
            conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public Integer cadastrar(Object object) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idMensagens = null;
        Mensagens oMensagens = (Mensagens) object;

        String sql = "Insert into mensagens values(?, ?, ?, ?) "
                + "returning (idmensagem);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, oMensagens.getIdChat());
            stmt.setString(2, oMensagens.getConteudo());
            stmt.setBoolean(3, oMensagens.getIsadministrative());
            stmt.setDate(4, (Date) oMensagens.getCreatedat());
            rs = stmt.executeQuery();

            if (rs.next()) {
                idMensagens = rs.getInt("idmensagem");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar Mensagens(MensagensDAO) Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao rechar conexao Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return idMensagens;
    }
}
