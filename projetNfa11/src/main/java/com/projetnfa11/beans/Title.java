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
@Table(name="Title")
public class Title implements Serializable {
    @Id
    private long idTitle;
    private Disque idDisque;
    private String nomTitre;
    private Artiste artiste; 

    /**
     * @return the idTitle
     */
    public long getIdTitle() {
        return idTitle;
    }

    /**
     * @param idTitle the idTitle to set
     */
    public void setIdTitle(long idTitle) {
        this.idTitle = idTitle;
    }

    /**
     * @return the idDisque
     */
    public Disque getIdDisque() {
        return idDisque;
    }

    /**
     * @param idDisque the idDisque to set
     */
    public void setIdDisque(Disque idDisque) {
        this.idDisque = idDisque;
    }

    /**
     * @return the nomTitre
     */
    public String getNomTitre() {
        return nomTitre;
    }

    /**
     * @param nomTitre the nomTitre to set
     */
    public void setNomTitre(String nomTitre) {
        this.nomTitre = nomTitre;
    }

    /**
     * @return the artiste
     */
    public Artiste getArtiste() {
        return artiste;
    }

    /**
     * @param artiste the artiste to set
     */
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

}
