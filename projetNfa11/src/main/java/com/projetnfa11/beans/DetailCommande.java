/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author DrBombay
 */
@Entity
@Table(name="DetailCommande")

public class DetailCommande implements Serializable {
     @Id
    private Commande commande;
    private long idProduitDC;
    private long qteDC;
    private Date dateCreaDC;
    private boolean isDeletedDC;

    /**
     * @return the idCommande
     */
    public Commande getCommande() {
        return commande;
    }

    /**
     * @param idCommande the idCommande to set
     */
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    /**
     * @return the idProduitDC
     */
    public long getIdProduitDC() {
        return idProduitDC;
    }

    /**
     * @param idProduitDC the idProduitDC to set
     */
    public void setIdProduitDC(long idProduitDC) {
        this.idProduitDC = idProduitDC;
    }

    /**
     * @return the qteDC
     */
    public long getQteDC() {
        return qteDC;
    }

    /**
     * @param qteDC the qteDC to set
     */
    public void setQteDC(long qteDC) {
        this.qteDC = qteDC;
    }

    /**
     * @return the dateCreaDC
     */
    public Date getDateCreaDC() {
        return dateCreaDC;
    }

    /**
     * @param dateCreaDC the dateCreaDC to set
     */
    public void setDateCreaDC(Date dateCreaDC) {
        this.dateCreaDC = dateCreaDC;
    }

    /**
     * @return the isDeletedDC
     */
    public boolean isIsDeletedDC() {
        return isDeletedDC;
    }

    /**
     * @param isDeletedDC the isDeletedDC to set
     */
    public void setIsDeletedDC(boolean isDeletedDC) {
        this.isDeletedDC = isDeletedDC;
    }
    
}
