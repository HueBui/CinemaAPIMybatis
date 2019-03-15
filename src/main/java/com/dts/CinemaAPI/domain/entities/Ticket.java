package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Ticket {
    private String idticket;
    private Integer price;
    private String idseat;
    private String idshowtime;

    @Id
    @Column(name = "idticket")
    public String getIdticket() {
        return idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "idseat")
    public String getIdseat() {
        return idseat;
    }

    public void setIdseat(String idseat) {
        this.idseat = idseat;
    }

    @Basic
    @Column(name = "idshowtime")
    public String getIdshowtime() {
        return idshowtime;
    }

    public void setIdshowtime(String idshowtime) {
        this.idshowtime = idshowtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(idticket, ticket.idticket) &&
                Objects.equals(price, ticket.price) &&
                Objects.equals(idseat, ticket.idseat) &&
                Objects.equals(idshowtime, ticket.idshowtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idticket, idseat, idshowtime);
    }
}
