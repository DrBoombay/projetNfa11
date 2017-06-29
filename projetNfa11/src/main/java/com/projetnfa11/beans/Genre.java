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
@Table(name="Genre")
public class Genre {
   @Id
    private String nomGenre;

    /**
     * @return the nomGenre
     */
    public String getNomGenre() {
        return nomGenre;
    }

    /**
     * @param nomGenre the nomGenre to set
     */
    public void setNomGenre(String nomGenre) {
        this.nomGenre = nomGenre;
    } 
    
}
