package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Seat {
    private String idseat;
    private Integer namerow;
    private String row;
    private Integer seattype;
    private Integer status;
    private String idroom;

    @Id
    @Column(name = "idseat")
    public String getIdseat() {
        return idseat;
    }

    public void setIdseat(String idseat) {
        this.idseat = idseat;
    }

    @Basic
    @Column(name = "namerow")
    public Integer getNamerow() {
        return namerow;
    }

    public void setNamerow(Integer namerow) {
        this.namerow = namerow;
    }

    @Basic
    @Column(name = "row")
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    @Basic
    @Column(name = "seattype")
    public Integer getSeattype() {
        return seattype;
    }

    public void setSeattype(Integer seattype) {
        this.seattype = seattype;
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
    @Column(name = "idroom")
    public String getIdroom() {
        return idroom;
    }

    public void setIdroom(String idroom) {
        this.idroom = idroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(idseat, seat.idseat) &&
                Objects.equals(namerow, seat.namerow) &&
                Objects.equals(row, seat.row) &&
                Objects.equals(seattype, seat.seattype) &&
                Objects.equals(status, seat.status) &&
                Objects.equals(idroom, seat.idroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idseat, namerow, row, seattype, status, idroom);
    }
}
