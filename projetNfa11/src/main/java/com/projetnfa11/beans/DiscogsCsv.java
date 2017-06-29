/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetnfa11.beans;
import java.util.Date;
/**
 *
 * @author DrBombay
 */
public class DiscogsCsv {
    private String catalog;
    private String Artiste;
    private String title;
    private String label;
    private String format;
    private String rating;
    private long released;
    private long releasedID;
    private String collectionFolder;
    private Date DateAdded;
    private String mediaCondition;
    private String sleeveCondition;
    private String collectionNotes;

    /**
     * @return the catalog
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * @param catalog the catalog to set
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * @return the Artiste
     */
    public String getArtiste() {
        return Artiste;
    }

    /**
     * @param Artiste the Artiste to set
     */
    public void setArtiste(String Artiste) {
        this.Artiste = Artiste;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the released
     */
    public long getReleased() {
        return released;
    }

    /**
     * @param released the released to set
     */
    public void setReleased(long released) {
        this.released = released;
    }

    /**
     * @return the releasedID
     */
    public long getReleasedID() {
        return releasedID;
    }

    /**
     * @param releasedID the releasedID to set
     */
    public void setReleasedID(long releasedID) {
        this.releasedID = releasedID;
    }

    /**
     * @return the collectionFolder
     */
    public String getCollectionFolder() {
        return collectionFolder;
    }

    /**
     * @param collectionFolder the collectionFolder to set
     */
    public void setCollectionFolder(String collectionFolder) {
        this.collectionFolder = collectionFolder;
    }

    /**
     * @return the DateAdded
     */
    public Date getDateAdded() {
        return DateAdded;
    }

    /**
     * @param DateAdded the DateAdded to set
     */
    public void setDateAdded(Date DateAdded) {
        this.DateAdded = DateAdded;
    }

    /**
     * @return the mediaCondition
     */
    public String getMediaCondition() {
        return mediaCondition;
    }

    /**
     * @param mediaCondition the mediaCondition to set
     */
    public void setMediaCondition(String mediaCondition) {
        this.mediaCondition = mediaCondition;
    }

    /**
     * @return the sleeveCondition
     */
    public String getSleeveCondition() {
        return sleeveCondition;
    }

    /**
     * @param sleeveCondition the sleeveCondition to set
     */
    public void setSleeveCondition(String sleeveCondition) {
        this.sleeveCondition = sleeveCondition;
    }

    /**
     * @return the collectionNotes
     */
    public String getCollectionNotes() {
        return collectionNotes;
    }

    /**
     * @param collectionNotes the collectionNotes to set
     */
    public void setCollectionNotes(String collectionNotes) {
        this.collectionNotes = collectionNotes;
    }
    
}
