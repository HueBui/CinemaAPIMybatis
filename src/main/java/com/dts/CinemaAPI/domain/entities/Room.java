package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Room {
    private String idroom;
    private String nameroom;
    private Integer quantityseat;
    private Integer status;
    private String idcinema;

    @Id
    @Column(name = "idroom")
    public String getIdroom() {
        return idroom;
    }

    public void setIdroom(String idroom) {
        this.idroom = idroom;
    }

    @Basic
    @Column(name = "nameroom")
    public String getNameroom() {
        return nameroom;
    }

    public void setNameroom(String nameroom) {
        this.nameroom = nameroom;
    }

    @Basic
    @Column(name = "quantityseat")
    public Integer getQuantityseat() {
        return quantityseat;
    }

    public void setQuantityseat(Integer quantityseat) {
        this.quantityseat = quantityseat;
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
    @Column(name = "idcinema")
    public String getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(String idcinema) {
        this.idcinema = idcinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(idroom, room.idroom) &&
                Objects.equals(nameroom, room.nameroom) &&
                Objects.equals(quantityseat, room.quantityseat) &&
                Objects.equals(status, room.status) &&
                Objects.equals(idcinema, room.idcinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idroom, nameroom, quantityseat, status, idcinema);
    }
}
