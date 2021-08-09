package com.conygre.training.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="compact_discs")
public class CompactDisc implements Serializable {

    // add an attribute specifying a column for the id property
    // add attributes to ensure that the id column is automantically generated
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    // add attributes for all the remaining properties
    @Column(name="title") private String title;
    @Column(name="artist") private String artist;
    @Column(name="price") private Double price;

    public CompactDisc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
