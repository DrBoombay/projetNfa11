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
@Table(name="Commande")
public class Commande implements Serializable {
    
     @Id
    private long idCommande;
    private User user;
    private Date dateCommande;
    private double montantCommande;
    private boolean isDeleted;
    private Date dateValidation;
    private String messageCommande;

    /**
     * @return the idCommande
     */
    public long getIdCommande() {
        return idCommande;
    }

    /**
     * @param idCommande the idCommande to set
     */
    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    /**
     * @return the idUserComm
     */
    public User getUser() {
        return user;
    }

    /**
     * @param idUserComm the idUserComm to set
     */
    public void setIdUserComm(User user) {
        this.user = user;
    }

    /**
     * @return the dateCommande
     */
    public Date getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the dateCommande to set
     */
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    /**
     * @return the montantCommande
     */
    public double getMontantCommande() {
        return montantCommande;
    }

    /**
     * @param montantCommande the montantCommande to set
     */
    public void setMontantCommande(double montantCommande) {
        this.montantCommande = montantCommande;
    }

    /**
     * @return the isDeleted
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted the isDeleted to set
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return the dateValidation
     */
    public Date getDateValidation() {
        return dateValidation;
    }

    /**
     * @param dateValidation the dateValidation to set
     */
    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    /**
     * @return the messageCommande
     */
    public String getMessageCommande() {
        return messageCommande;
    }

    /**
     * @param messageCommande the messageCommande to set
     */
    public void setMessageCommande(String messageCommande) {
        this.messageCommande = messageCommande;
    }
}
