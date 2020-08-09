/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Passagem;

/**
 *
 * @author user
 */
public class PassagemDAO {            
    public List<Passagem> readByPetName(String nomePet){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?);");
            stmt.setString(1, nomePet);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByIdTag(int idTag){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idTag = ?;");
            stmt.setInt(1, idTag);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByDoorId(int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idPorta = ?;");
            stmt.setInt(1, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPassageDate(String dataPassagem){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE dataPassagem = ?;");
            stmt.setString(1, dataPassagem);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNameAndIdTag(String nomePet, int idTag){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND idTag = ?;");
            stmt.setString(1, nomePet);
            stmt.setInt(2, idTag);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNameAndDoorId(String nomePet, int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND idPorta = ?;");
            stmt.setString(1, nomePet);
            stmt.setInt(2, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNameAndPassageDate(String nomePet, String dataPassagem){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND dataPassagem = ?;");
            stmt.setString(1, nomePet);
            stmt.setString(2, dataPassagem);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByIdTagAndDoorId(int idTag, int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idTag = ? AND idPorta = ?;");
            stmt.setInt(1, idTag);
            stmt.setInt(2, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByIdTagAndPassageDate(int idTag, String dataPassagem){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idTag = ? AND dataPassagem = ?;");
            stmt.setInt(1, idTag);
            stmt.setString(2, dataPassagem);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByDoorIdAndPassageDate(int idPorta, String dataPassagem){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idPorta = ? AND dataPassagem = ?;");
            stmt.setInt(1, idPorta);
            stmt.setString(2, dataPassagem);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNameIdTagAndDoorId(String nomePet, int idTag, int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND idTag = ? AND idPorta = ?;");
            stmt.setString(1, nomePet);
            stmt.setInt(2, idTag);
            stmt.setInt(3, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNamePassageDateAndDoorId(String nomePet, String dataPassagem, int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND dataPassagem = ? AND idPorta = ?;");
            stmt.setString(1, nomePet);
            stmt.setString(2, dataPassagem);
            stmt.setInt(3, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNamePassageDateAndIdTag(String nomePet, String dataPassagem, int idTag){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND dataPassagem = ? AND idTag = ?;");
            stmt.setString(1, nomePet);
            stmt.setString(2, dataPassagem);
            stmt.setInt(3, idTag);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByDoorIdPassageDateAndIdTag(int idPorta, int idTag, String dataPassagem){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE idPorta = ? AND dataPassagem = ? AND idTag = ?;");
            stmt.setInt(1, idPorta);
            stmt.setString(2, dataPassagem);
            stmt.setInt(3, idTag);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    
    public List<Passagem> readByPetNamePassageDateIdPetAndDoorId(String nomePet, String dataPassagem, int idTag, int idPorta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem WHERE EXISTS (SELECT pet.nomePet FROM pet WHERE nomePet = ?) AND dataPassagem = ? AND idTag = ? AND idPorta = ?;");
            stmt.setString(1, nomePet);
            stmt.setString(2, dataPassagem);
            stmt.setInt(3, idTag);
            stmt.setInt(4, idPorta);
            rs = stmt.executeQuery();
            if(rs.next()){
                do{
                    Passagem passagem = new Passagem();
                    passagem.setDataPassagem(rs.getDate("dataPassagem"));
                    passagem.setHoraPassagem(rs.getTime("horaPassagem"));
                    passagem.setIdPorta(rs.getInt("idPorta"));
                    passagem.setIdTag(rs.getInt("idTag"));
                    passagem.setDirecao(rs.getString("direcao"));
                    passagens.add(passagem);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar passagens: "+ex, null, JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
}
