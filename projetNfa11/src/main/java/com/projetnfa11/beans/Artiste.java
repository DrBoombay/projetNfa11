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
@Table(name="Artiste")
public class Artiste implements Serializable {
    
    
    @Id 
    private long idArtiste ;
    private String prnomArtiste;
    private String nomArtiste;

    /**
     * @return the idArtiste
     */
    public long getIdArtiste() {
        return idArtiste;
    }

    /**
     * @param idArtiste the idArtiste to set
     */
    public void setIdArtiste(int idArtiste) {
        this.idArtiste = idArtiste;
    }

    /**
     * @return the prnomArtiste
     */
    public String getPrnomArtiste() {
        return prnomArtiste;
    }

    /**
     * @param prnomArtiste the prnomArtiste to set
     */
    public void setPrnomArtiste(String prnomArtiste) {
        this.prnomArtiste = prnomArtiste;
    }

    /**
     * @return the nomArtiste
     */
    public String getNomArtiste() {
        return nomArtiste;
    }

    /**
     * @param nomArtiste the nomArtiste to set
     */
    public void setNomArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }
    
    
}
