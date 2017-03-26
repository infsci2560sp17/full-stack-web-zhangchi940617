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
public class Magazine {

    private static final long serialVersionUID = 1L;

    public enum MagazineType {
        Unknown,
        Entertainment,
        Tourist,
        Health,
        Auto
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected MagazineType magazineType;
    protected String year;
    protected String month;

    public Magazine() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.magazineType = MagazineType.Unknown;
        this.year=null;
        this.month=null;
    }

    public Magazine(Long id, String name, MagazineType magazineType, String year, String mongth) {
        this.id = id;
        this.title = name;
        this.magazineType = magazineType;
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", magazineType=" + this.magazineType + ", year=" + this.year +", month=" + this.month +" ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public MagazineType getMagazineType() {
        return magazineType;
    }

    public void setMagazineType(MagazineType magazineType) {
        this.magazineType = magazineType;
    }

    public String getYear() {
        return year;
    }

    
    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    
    public void setMonth(String month) {
        this.month = month;
    }

    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }
}
