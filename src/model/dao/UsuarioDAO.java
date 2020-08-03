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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author user
 */
public class UsuarioDAO {
    public boolean create(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, u.getNome());
            rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");
            } else {
                stmt = con.prepareStatement("INSERT INTO usuario (login, senha, email, telefone) VALUES (?, ?, ?, ?)");
                stmt.setString(1, u.getNome());
                stmt.setString(2, u.getSenha());
                stmt.setString(3, u.getEmail());
                stmt.setString(4, u.getTelefone());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "[ERRO] Ao cadastrar usuário: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
    
    public boolean checkLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            if(rs.next()){
                stmt = con.prepareStatement("SELECT * FROM usuario WHERE senha = ?");
                stmt.setString(1, senha);
                rs = stmt.executeQuery();
                if(rs.next()){
                   check = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                }
                /*Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));*/
            } else {
                JOptionPane.showMessageDialog(null, "Usuário inexistente!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
}
