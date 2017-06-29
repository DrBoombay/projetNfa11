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
@Table(name="Format")
public class Format implements Serializable {
     @Id
    private String nomFormat;

    /**
     * @return the nomFormat
     */
    public String getNomFormat() {
        return nomFormat;
    }

    /**
     * @param nomFormat the nomFormat to set
     */
    public void setNomFormat(String nomFormat) {
        this.nomFormat = nomFormat;
    }
}
