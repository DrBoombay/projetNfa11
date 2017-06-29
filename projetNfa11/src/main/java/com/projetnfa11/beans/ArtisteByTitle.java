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
@Table(name="ArtisteByTitle")
public class ArtisteByTitle implements Serializable{
    @Id
    private Artiste artiste;
    @Id
    private Title title;

    /**
     * @return the idArtiste
     */
    public Artiste getArtiste() {
        return artiste;
    }

    /**
     * @param idArtiste the idArtiste to set
     */
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    /**
     * @return the idTitle
     */
    public Title getTitle() {
        return title;
    }

    /**
     * @param idTitle the idTitle to set
     */
    public void setTitle(Title title) {
        this.title = title;
    }
    
    
}
