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

@Table(name="User")  
public class User implements Serializable {
    @Id
    private long idUser;
    private String nomUser;
    private String prenomUser;
    private String mailUser;
    private String mpUser;
    private Date signUpDate;
    private Date lastConn;

    /**
     * @return the idUser
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the nomUser
     */
    public String getNomUser() {
        return nomUser;
    }

    /**
     * @param nomUser the nomUser to set
     */
    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    /**
     * @return the prenomUser
     */
    public String getPrenomUser() {
        return prenomUser;
    }

    /**
     * @param prenomUser the prenomUser to set
     */
    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    /**
     * @return the mailUser
     */
    public String getMailUser() {
        return mailUser;
    }

    /**
     * @param mailUser the mailUser to set
     */
    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    /**
     * @return the mpUser
     */
    public String getMpUser() {
        return mpUser;
    }

    /**
     * @param mpUser the mpUser to set
     */
    public void setMpUser(String mpUser) {
        this.mpUser = mpUser;
    }

    /**
     * @return the signUpDate
     */
    public Date getSignUpDate() {
        return signUpDate;
    }

    /**
     * @param signUpDate the signUpDate to set
     */
    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    /**
     * @return the lastConn
     */
    public Date getLastConn() {
        return lastConn;
    }

    /**
     * @param lastConn the lastConn to set
     */
    public void setLastConn(Date lastConn) {
        this.lastConn = lastConn;
    }
    
}
