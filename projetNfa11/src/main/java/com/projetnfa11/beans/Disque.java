/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author DrBombay
 */
@Entity
@Table(name="Disque")
public class Disque implements Serializable{
    @Id
    private long idDisque;
    private Format format;
    private Label label;
    private Title title;
    private Date releaseDisque;
    private double prix;

    /**
     * @return the idDisque
     */
    public long getIdDisque() {
        return idDisque;
    }

    /**
     * @param idDisque the idDisque to set
     */
    public void setIdDisque(long idDisque) {
        this.idDisque = idDisque;
    }

    /**
     * @return the format
     */
    public Format getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * @return the label
     */
    public Label getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * @return the titre
     */
    public Title getTitre() {
        return title;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(Title titre) {
        this.title = titre;
    }

    /**
     * @return the releaseDisque
     */
    public Date getReleaseDisque() {
        return releaseDisque;
    }

    /**
     * @param releaseDisque the releaseDisque to set
     */
    public void setReleaseDisque(Date releaseDisque) {
        this.releaseDisque = releaseDisque;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    
    
}
