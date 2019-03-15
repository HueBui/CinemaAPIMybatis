package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Showtime {
    private String idshowtime;
    private Timestamp dateshow;
    private Integer frametime;
    private String idroom;
    private String idcinema;
    private String idmovie;

    @Id
    @Column(name = "idshowtime")
    public String getIdshowtime() {
        return idshowtime;
    }

    public void setIdshowtime(String idshowtime) {
        this.idshowtime = idshowtime;
    }

    @Basic
    @Column(name = "dateshow")
    public Timestamp getDateshow() {
        return dateshow;
    }

    public void setDateshow(Timestamp dateshow) {
        this.dateshow = dateshow;
    }

    @Basic
    @Column(name = "frametime")
    public Integer getFrametime() {
        return frametime;
    }

    public void setFrametime(Integer frametime) {
        this.frametime = frametime;
    }

    @Basic
    @Column(name = "idroom")
    public String getIdroom() {
        return idroom;
    }

    public void setIdroom(String idroom) {
        this.idroom = idroom;
    }

    @Basic
    @Column(name = "idcinema")
    public String getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(String idcinema) {
        this.idcinema = idcinema;
    }

    @Basic
    @Column(name = "idmovie")
    public String getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(String idmovie) {
        this.idmovie = idmovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Showtime showtime = (Showtime) o;
        return Objects.equals(idshowtime, showtime.idshowtime) &&
                Objects.equals(dateshow, showtime.dateshow) &&
                Objects.equals(frametime, showtime.frametime) &&
                Objects.equals(idroom, showtime.idroom) &&
                Objects.equals(idcinema, showtime.idcinema) &&
                Objects.equals(idmovie, showtime.idmovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idshowtime, dateshow, frametime, idroom, idcinema, idmovie);
    }
}
