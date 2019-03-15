package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Cinema {
    private int idcinema;
    private String address;
    private String area;
    private String namecinema;

    @Id
    @Column(name = "idcinema")
    public int getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(int idcinema) {
        this.idcinema = idcinema;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "namecinema")
    public String getNamecinema() {
        return namecinema;
    }

    public void setNamecinema(String namecinema) {
        this.namecinema = namecinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return idcinema == cinema.idcinema &&
                Objects.equals(address, cinema.address) &&
                Objects.equals(area, cinema.area) &&
                Objects.equals(namecinema, cinema.namecinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcinema, address, area, namecinema);
    }
}
