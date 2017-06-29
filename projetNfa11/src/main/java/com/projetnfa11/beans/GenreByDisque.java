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
@Table(name="GenreByDisque")
public class GenreByDisque implements Serializable {
    
    @Id
    private Disque disque;
    @Id
    private Genre genre; 

    /**
     * @return the IdDisque
     */
    public Disque getDisque() {
        return disque;
    }

    /**
     * @param IdDisque the IdDisque to set
     */
    public void setIdDisque(Disque disque) {
        this.disque = disque;
    }

    /**
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
}
