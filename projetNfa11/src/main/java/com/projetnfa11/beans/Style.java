/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author DrBombay
 */
@Entity
@Table(name="Style")
public class Style implements Serializable{
     @Id
    private String nomStyle;

    /**
     * @return the nomStyle
     */
    public String getNomStyle() {
        return nomStyle;
    }

    /**
     * @param nomStyle the nomStyle to set
     */
    public void setNomStyle(String nomStyle) {
        this.nomStyle = nomStyle;
    }
    
    
}
