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
@Table(name="LabelByDisque")
public class LabelByDisque implements Serializable{
    @Id
private Label label;
private Disque disque;

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
     * @return the disque
     */
    public Disque getDisque() {
        return disque;
    }

    /**
     * @param disque the disque to set
     */
    public void setDisque(Disque disque) {
        this.disque = disque;
    }

}
