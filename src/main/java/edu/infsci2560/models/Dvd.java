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

/**
 *
 * @author kolobj
 */
@Entity
public class Dvd {

    private static final long serialVersionUID = 1L;

    public enum BookType {
        Unknown,
        Management,
        Novel,
        Art
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected BookType bookType;

    public Dvd() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.bookType = BookType.Unknown;
    }

    public Dvd(Long id, String name, BookType bookType) {
        this.id = id;
        this.title = name;
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", bookType=" + this.bookType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public BookType getBookType() {
        return bookType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
