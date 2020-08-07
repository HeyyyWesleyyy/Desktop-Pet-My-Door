/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import view.Home;
import view.Login;

/**
 *
 * @author user
 */
public class UsuarioDAO {
    public void create(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, u.getNome());
            rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado!", "[ERRO]", JOptionPane.WARNING_MESSAGE);
            } else {
                stmt = con.prepareStatement("INSERT INTO usuario (login, senha, email, telefone) VALUES (?, ?, ?, ?)");
                stmt.setString(1, u.getNome());
                stmt.setString(2, u.getSenha());
                stmt.setString(3, u.getEmail());
                stmt.setString(4, u.getTelefone());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
                new Home().setVisible(true);
                Home.lbl_welcome.setText(u.getNome());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar usuário: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public Usuario read(String login){
        Usuario usuario = new Usuario();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            if(rs.next()){
                usuario.setNome("login");
                usuario.setSenha("senha");
                usuario.setEmail("email");
                usuario.setTelefone("telefone");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    public void checkLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            if(rs.next()){
                stmt = con.prepareStatement("SELECT * FROM usuario WHERE senha = ?");
                stmt.setString(1, senha);
                rs = stmt.executeQuery();
                if(rs.next()){
                    new Home().setVisible(true);
                    Home.lbl_welcome.setText(rs.getString("login"));
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!", "[ERRO]", JOptionPane.WARNING_MESSAGE);
                }
                /*Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));*/
            } else {
                JOptionPane.showMessageDialog(null, "Usuário inexistente!", "[ERRO]", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
}
