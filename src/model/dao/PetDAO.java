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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Pet;
import model.bean.Usuario;
import view.Home;

/**
 *
 * @author user
 */
public class PetDAO {
    public void create(Pet pet){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Home.lbl_welcome.getText();
        try {
            stmt = con.prepareStatement("SELECT * FROM pet WHERE nomePet = ? AND login = ?");
            stmt.setString(1, pet.getNomePet());
            stmt.setString(2, Home.lbl_welcome.getText());
            rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Pet já cadastrado!", "[ERRO]", JOptionPane.WARNING_MESSAGE);
            } else {
                stmt = con.prepareStatement("INSERT INTO pet (nomePet, login) VALUES (?, ?)");
                stmt.setString(1, pet.getNomePet());
                stmt.setString(2, Home.lbl_welcome.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Pet cadastrado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar pet: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Pet> read(String userLogin){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pet> pets = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pet WHERE login = ?");
            stmt.setString(1, userLogin);
            rs = stmt.executeQuery();
            while(rs.next()){
                Pet pet = new Pet();
                pet.setIdTag(rs.getInt("idTag"));
                pet.setNomePet(rs.getString("nomePet"));
                pet.setLogin(rs.getString("login"));
                pets.add(pet);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar seus pet: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pets;
    }
}
