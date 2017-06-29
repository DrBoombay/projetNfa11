/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;
import  java.io.Serializable;
 import javax.persistence.*;
/**
 *
 * @author DrBombay
 */
@Entity
@Table(name="Collection")
public class Collection  implements Serializable{
     @Id
    private User user;
    private Disque disque;

    /**
     * @return the idUser
     */
    public User getUser() {
        return user;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setUser(User idUser) {
        this.user = user;
    }

    /**
     * @return the idDisque
     */
    public Disque getDisque() {
        return disque;
    }

    /**
     * @param idDisque the idDisque to set
     */
    public void setDisque(Disque disque) {
        this.disque = disque;
    }
    
}
