/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.goemergency.dao;

import br.com.goemergency.model.Chat;
import br.com.goemergency.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author windows
 */
public class ChatDAOImpl {

    Connection conn;

    public ChatDAOImpl() throws Exception {
        try {
            conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

     public Integer isValidChat(Object object) throws SQLException {
        PreparedStatement stmt = null;
        Integer idChat = null;
      //Chat oChat = new Chat();
        ResultSet rs = null;
        Chat oChat = (Chat) object;
        
        String sql = "SELECT * from Chat"
                + " WHERE idmedico = ? and idpaciente = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, oChat.getIdmedico());
            stmt.setInt(2, oChat.getIdpaciente());
            rs = stmt.executeQuery();
            if (rs.next()) {
                oChat.setIdchat(oChat.getIdchat());
            } else {
                return null;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao verificar chat no banco (ChatDAO):" 
                    + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
        return idChat;
    }
     
    public Integer cadastrar(Object object) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idChat = null;
        Chat oChat = (Chat) object;

        String sql = "Insert into Chat values(?, ?) returning (idchat);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, oChat.getIdmedico());
            stmt.setInt(2, oChat.getIdpaciente());
           
            rs = stmt.executeQuery();

            if (rs.next()) {
                idChat = rs.getInt("idChat");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar Chat(ChatDAO) Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao rechar conexao Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return idChat;
    }
    

    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * from Chat"
                + " WHERE idchat? ;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Chat oChat = new Chat();
                oChat.setIdchat(rs.getInt("idChat"));
                oChat.setIdmedico(rs.getInt("idmedico"));
                oChat.setIdchat(rs.getInt("idpaciente"));
                
                resultado.add(oChat);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar ChatDAOImpl \n Erro: " + ex.getMessage());
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
}
