package com.conygre.training.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name = "tracks")
public class Track implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

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

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    @Column(name = "cd_id")
    private Integer cdId;

    // constructors
    public Track(){ }
    public Track(int id, String title, int cdId){
        this.title=title;
        this.id = id;
        this.cdId = cdId;
    }
    public Track(String title) {
        this.title = title;
    }
}
