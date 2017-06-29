/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author DrBombay
 */
@Entity
@Table(name="Label")
public class Label implements Serializable{
    
    @Id
    private long idLabel;
    private String nomLabel;

    /**
     * @return the idLabel
     */
    public long getIdLabel() {
        return idLabel;
    }

    /**
     * @param idLabel the idLabel to set
     */
    public void setIdLabel(long idLabel) {
        this.idLabel = idLabel;
    }

    /**
     * @return the nomLabel
     */
    public String getNomLabel() {
        return nomLabel;
    }

    /**
     * @param nomLabel the nomLabel to set
     */
    public void setNomLabel(String nomLabel) {
        this.nomLabel = nomLabel;
    
}
}
    

