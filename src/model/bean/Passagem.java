/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author user
 */
public class Passagem {
    private Date dataPassagem;
    private Time horaPassagem;
    private int idPorta;
    private int idTag;
    private String direcao;

    public Date getDataPassagem() {
        return dataPassagem;
    }

    public void setDataPassagem(Date dataPassagem) {
        this.dataPassagem = dataPassagem;
    }

    public Time getHoraPassagem() {
        return horaPassagem;
    }

    public void setHoraPassagem(Time horaPassagem) {
        this.horaPassagem = horaPassagem;
    }

    public int getIdPorta() {
        return idPorta;
    }

    public void setIdPorta(int idPorta) {
        this.idPorta = idPorta;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    
}
