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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Pet;
import model.bean.Porta;
import view.Home;

/**
 *
 * @author user
 */
public class PortaDAO {
    public void create(Porta porta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Home.lbl_welcome.getText();
        try {
            stmt = con.prepareStatement("INSERT INTO porta (localizacao, login) VALUES (?, ?)");
            stmt.setString(1, porta.getLocalizacao());
            stmt.setString(2, Home.lbl_welcome.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Porta cadastrada com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar porta: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Porta> read(String userLogin){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Porta> portas = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM porta WHERE login = ?");
            stmt.setString(1, userLogin);
            rs = stmt.executeQuery();
            while(rs.next()){
                Porta porta = new Porta();
                porta.setIdPorta(rs.getInt("idPorta"));
                porta.setLocalizacao(rs.getString("localizacao"));
                porta.setLogin(rs.getString("login"));
                portas.add(porta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar seus pet: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return portas;
    }
    
    public void delete(Porta porta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("DELETE FROM porta WHERE idPorta = ?");
            stmt.setInt(1, porta.getIdPorta());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Porta excluída com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir porta: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
