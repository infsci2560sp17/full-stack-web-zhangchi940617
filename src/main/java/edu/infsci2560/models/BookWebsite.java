/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class BookWebsite {

    private static final long serialVersionUID = 1L;

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String website;
    protected String link;

    public BookWebsite() {
        this.id = Long.MAX_VALUE;
        this.website = null;
        this.link = null;
    }

    public BookWebsite(Long id, String website, String link) {
        this.id = id;
        this.website = website;
        this.link = link;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", website=" + this.website + ", link=" + this.link + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    
    public String getWebsite() {
        return website;
    }

    
    public void setWebsite(String website) {
        this.website = website;
    }

    
    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

}
