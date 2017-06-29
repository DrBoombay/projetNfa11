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
@Table(name="StyleByDisque")
public class StyleByDisque {
    @Id
    private Disque disque;
    @Id
    private Style style;

    /**
     * @return the idDisque
     */
    public Disque getDisque() {
        return disque;
    }

    /**
     * @param idDisque the idDisque to set
     */
    public void setIdDisque(Disque disque) {
        this.disque = disque;
    }

    /**
     * @return the nomStyle
     */
    public Style getStyle() {
        return style;
    }

    /**
     * @param nomStyle the nomStyle to set
     */
    public void setNomStyle(Style style) {
        this.style = style;
    }
    
}
