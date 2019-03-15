package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Booking {
    private String idbooking;
    private String idticket;
    private String iduser;
    private Integer status;

    @Id
    @Column(name = "idbooking")
    public String getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(String idbooking) {
        this.idbooking = idbooking;
    }

    @Basic
    @Column(name = "idticket")
    public String getIdticket() {
        return idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }

    @Basic
    @Column(name = "iduser")
    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(idbooking, booking.idbooking) &&
                Objects.equals(idticket, booking.idticket) &&
                Objects.equals(iduser, booking.iduser) &&
                Objects.equals(status, booking.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idbooking, idticket, iduser, status);
    }
}
