/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.goemergency.dao;

import br.com.goemergency.model.Email;
import br.com.goemergency.model.Endereco;
import br.com.goemergency.model.Pessoa;
import br.com.goemergency.util.ConnectionFactory;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Aluno
 */
public class PessoaDAOImpl implements GenericDAO {

    private Connection conn;
    
    public PessoaDAOImpl() throws Exception {
        try{
            conn= ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    } 
    
    @Override
    public Integer cadastrar(Object object) {
       PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa pessoa = (Pessoa) object;
        Integer idPessoa = null;
        String sql = "INSERT INTO PESSOA"
                + "(cpf, nome, datanascimento, email, senha, telefone, idendereco, isPaciente, isMedico, isAdmin)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?) RETURNING (idpessoa)";
                
        try{
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, pessoa.getCpf());
            stmt.setString(2, pessoa.getNome());
            stmt.setDate(3, new java.sql.Date
                         (pessoa.getDatanascimento().getTime()));
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getSenha());
            stmt.setString(6, pessoa.getTelefone());
            stmt.setInt(7, pessoa.getIdEndereco());
            stmt.setBoolean(8, pessoa.isIsPaciente());
            stmt.setBoolean(9, pessoa.isIsMedico());
            stmt.setBoolean(10, pessoa.isIsAdmin());
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                idPessoa = rs.getInt("idPessoa");
                
            }
        }catch(Exception ex){
                System.out.println("Erro ao SalvarPessoa. Erro:"
                        + ex.getMessage());
                ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Erro ao Fechar Conexão. Erro:"
                + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idPessoa;
    }

    
         
    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT p*, e.*"
                + " from pessoa p, Endereco e"
                + " where p.idEndereco = e.idEndereco"
                + " order by p.nome;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa oPessoa = new Pessoa();
                oPessoa.setIdPessoa(rs.getInt("idpessoa"));
                oPessoa.setNome(rs.getString("nome"));
                oPessoa.setCpf(rs.getString("cpf"));
                oPessoa.setDatanascimento(rs.getDate("datanascimento"));
                oPessoa.setEmail(rs.getString("Email"));
                oPessoa.setSenha(rs.getString("senha"));
//                oPessoa.setEndereco(new Endereco(rs.getString("rua")));
                oPessoa.setIsPaciente(rs.getBoolean("isPaciente"));
                oPessoa.setIsMedico(rs.getBoolean("isMedico"));
                oPessoa.setIsAdmin(rs.getBoolean("isAdmin"));
                resultado.add(oPessoa);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar PessoaDAOImpl \n Erro: " + ex.getMessage());
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
        Pessoa oPessoa = new Pessoa();
        
        String sql="Update pessoa set inactivatedat = current_timestamp, updatedat = current_timestamp where idPessoa=?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1,  new java.sql.Date (oPessoa.getInactivatedAt().getTime()));
            stmt.setDate(2,  new java.sql.Date (oPessoa.getUpdatedat().getTime()));
            stmt.setInt(3, oPessoa.getIdPessoa());
            stmt.executeUpdate();
        }catch (Exception ex){
            System.out.println("Erro ao Exluir PessoaDAOImpl \n Erro: "+ ex.getMessage());
            ex.printStackTrace();
        }finally {
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex){
                System.out.println("Erro ao fechar conexao \n Eroo: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        Pessoa oPessoa = new Pessoa();
        ResultSet rs = null;
        
        String sql = "SELECT p.*, e.*"
                + " from pessoa p, Endereco e"
                + " where p.idEndereco = cd.idEndereco"
                + " and c.idpessoa = ? ORDER BY p.nome";

        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                oPessoa.setIdPessoa(rs.getInt("idPessoa"));
                oPessoa.setNome(rs.getString("nome"));
                oPessoa.setCpf(rs.getString("cpf"));
                oPessoa.setDatanascimento(rs.getDate("datanascimento"));
                oPessoa.setEmail(rs.getString("Email"));
                oPessoa.setSenha(rs.getString("senha"));
//                oPessoa.setEndereco(new Endereco(rs.getInt("idEndereco"), rs.getString("rua")));
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao Carregar PessoaDAOImpl \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }finally{
                try{
                    ConnectionFactory.fechar(conn, stmt, null);
                }catch(Exception ex) {
                    System.out.println("Erro ao Fechar Conexão Erro:" + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        
            return oPessoa;
    }
    
    @Override
    public Boolean alterar(Object object) {
        PreparedStatement stmt = null;
        Pessoa oPessoa = (Pessoa) object;
        
        String sql = "UPDATE pessoa SET "
                + "nome = ?,"
                + "cpf = ?,"
                + "datanascimento = ?,"
                + "email = ?, "
                + "senha = ?, "
                + "telefone = ?"
                + "idEndereco = ?, "
                + "updatedat = current_timestamp"
                + "WHERE idpessoa = ?";
                
        try{
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, oPessoa.getNome());
            stmt.setString(2, oPessoa.getCpf());
            stmt.setDate(3, new java.sql.Date
                         (oPessoa.getDatanascimento().getTime()));
            stmt.setString(4, oPessoa.getEmail());
            stmt.setString(5, oPessoa.getSenha());
//            stmt.setInt(6, oPessoa.getEndereco().getIdEndereco());
            stmt.setString(7, oPessoa.getTelefone());
            stmt.setDate(8,  new java.sql.Date (oPessoa.getUpdatedat().getTime()));
            stmt.setInt(9, oPessoa.getIdPessoa());
            
            stmt.executeUpdate();
            
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao alterar PessoaDAOImpl. Erro:"
                    + ex.getMessage());
            ex.printStackTrace();
                
            return false;
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex){
                System.out.println("Erro ao Fechar Conexão. Erro:"
                + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public Pessoa logarPessoa(String Email, String senha) throws SQLException{
        PreparedStatement stmt = null;
        Pessoa oPessoa = null;
        ResultSet rs = null;

         String sql = "SELECT * from pessoa"
                + " WHERE email = ? "
                + " AND senha = ? "
                + " AND inactivatedat IS NULL ";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oPessoa = new Pessoa();
                        
                oPessoa.setIdPessoa(rs.getInt("idpessoa"));
                oPessoa.setNome(rs.getString("nome"));
                oPessoa.setEmail(rs.getString("Email"));
                
                oPessoa.setIdPessoa(rs.getInt("idPessoa"));
                oPessoa.setCpf(rs.getString("cpf"));
            }
        } catch (SQLException ex) {
                System.out.println("Erro ao Logar Pessoa \n Erro: " + ex.getMessage());
                ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex) {
                System.out.println("Erro ao Fechar Conexão Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        } 
        return oPessoa;
    }
    public Pessoa enviarEmail(String Email) throws SQLException, MessagingException {
        // Recipient's email ID needs to be mentioned.
        PreparedStatement stmt = null;
        Pessoa oPessoa = new Pessoa();
        ResultSet rs = null;
        Email oEmail = new Email();
        oEmail.setEmailDestinatario(Email);//change accordingly
        
        String sql = "SELECT * from pessoa"
                + " WHERE email = ?"
                + " AND inactivatedat IS NULL";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Email);
            rs = stmt.executeQuery();
            if (rs.next()) {
                oPessoa.setEmail(Email);
            }

            String to = oEmail.getEmailDestinatario();

            //provide sender's email ID
            String from = "vp259407@gmail.com";
            //provide Mailtrap's username
            final String username = "e6b7667169ed6d";
            //provide Mailtrap's password
            final String password = "72127b0658ffe0";

            //provide Mailtrap's host address
            String host = "smtp.mailtrap.io";
            //configure Mailtrap's SMTP server details
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.setProperty("mail.transport.protocol", "smtp");

            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.ssl.trust", "*");
            Object requireTls = null;
            props.setProperty("mail.smtp.starttls.enable", String.valueOf(requireTls));//True or False
            props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            props.setProperty("mail.smtp.timeout", "300000");
            props.setProperty("mail.smtp.connectiontimeout", "300000");
            props.setProperty("mail.smtp.writetimeout", "300000");

            //create the Session object
            Session session = Session.getInstance(props,
                    new jakarta.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {
                //create a MimeMessage object
                Message message = new MimeMessage(session);

                //set From email field
                message.setFrom(new InternetAddress(from));

                //set To email field
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(to));

                //set email subject field
                message.setSubject("Here comes Jakarta Mail!");

                //set the content of the email message
                message.setText("Just discovered that Jakarta Mail is fun and easy to use");

                //send the email message
                Transport.send(message);

            } catch (MessagingException ex) {
                System.out.println("Erro ao Enviar Email(PessoaDAOImpl): Erro:" + ex.getMessage());
                throw new RuntimeException(ex);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Encontrar Email \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar Conexão Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oPessoa;
    }

    public boolean isValidEmailAddress(String Email) throws SQLException {
        boolean result = true;
        PreparedStatement stmt = null;
        Pessoa oPessoa = new Pessoa();
        ResultSet rs = null;

        try {
            InternetAddress emailAddr = new InternetAddress(Email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
            System.out.println("Erro ao Validar email:" + ex.getMessage());
            ex.printStackTrace();
        }
        String sql = "SELECT * from pessoa"
                + " WHERE email = ?"
                + " AND inactivatedat IS NULL";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Email);
            rs = stmt.executeQuery();
            if (rs.next()) {
                oPessoa.setEmail(Email);
            }
        
        }catch(SQLException ex){
            result = false;
            System.out.println("Erro ao verificar email no banco (PESSOA):" + ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }
}
