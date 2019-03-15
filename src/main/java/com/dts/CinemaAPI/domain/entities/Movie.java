package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Movie {
    private String idmovie;
    private String discription;
    private Integer duration;
    private String image;
    private String language;
    private String moviename;
    private String rated;
    private Date start;
    private Integer status;
    private String trailler;
    private String idcatagory;
    private String iddirector;
    private String idactor;

    @Id
    @Column(name = "idmovie")
    public String getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(String idmovie) {
        this.idmovie = idmovie;
    }

    @Basic
    @Column(name = "discription")
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Basic
    @Column(name = "duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "moviename")
    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    @Basic
    @Column(name = "rated")
    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    @Basic
    @Column(name = "start")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "trailler")
    public String getTrailler() {
        return trailler;
    }

    public void setTrailler(String trailler) {
        this.trailler = trailler;
    }

    @Basic
    @Column(name = "idcatagory")
    public String getIdcatagory() {
        return idcatagory;
    }

    public void setIdcatagory(String idcatagory) {
        this.idcatagory = idcatagory;
    }

    @Basic
    @Column(name = "iddirector")
    public String getIddirector() {
        return iddirector;
    }

    public void setIddirector(String iddirector) {
        this.iddirector = iddirector;
    }

    @Basic
    @Column(name = "idactor")
    public String getIdactor() {
        return idactor;
    }

    public void setIdactor(String idactor) {
        this.idactor = idactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(idmovie, movie.idmovie) &&
                Objects.equals(discription, movie.discription) &&
                Objects.equals(duration, movie.duration) &&
                Objects.equals(image, movie.image) &&
                Objects.equals(language, movie.language) &&
                Objects.equals(moviename, movie.moviename) &&
                Objects.equals(rated, movie.rated) &&
                Objects.equals(start, movie.start) &&
                Objects.equals(status, movie.status) &&
                Objects.equals(trailler, movie.trailler) &&
                Objects.equals(idcatagory, movie.idcatagory) &&
                Objects.equals(iddirector, movie.iddirector) &&
                Objects.equals(idactor, movie.idactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmovie, discription, duration, image, language, moviename, rated, start, status, trailler, idcatagory, iddirector, idactor);
    }
}
