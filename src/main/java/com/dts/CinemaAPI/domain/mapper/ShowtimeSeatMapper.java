package com.dts.CinemaAPI.domain.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ShowtimeSeatMapper {
    private String idShowtime;
    private String nameRoom;
    private String row;
    private String nameRow;
    private String idSeat;
    private String seatType;

    public String getIdShowtime() {
        return idShowtime;
    }

    public void setIdShowtime(String idShowtime) {
        this.idShowtime = idShowtime;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getNameRow() {
        return nameRow;
    }

    public void setNameRow(String nameRow) {
        this.nameRow = nameRow;
    }

    public String getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(String idSeat) {
        this.idSeat = idSeat;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "ShowtimeSeatMapper{" +
                "idShowtime='" + idShowtime + '\'' +
                ", nameRoom='" + nameRoom + '\'' +
                ", row='" + row + '\'' +
                ", nameRow='" + nameRow + '\'' +
                ", idSeat='" + idSeat + '\'' +
                ", seatType='" + seatType + '\'' +
                '}';
    }

    public ShowtimeSeatMapper() {
    }

    public ShowtimeSeatMapper(String idShowtime, String nameRoom, String row, String nameRow, String idSeat, String seatType) {
        this.idShowtime = idShowtime;
        this.nameRoom = nameRoom;
        this.row = row;
        this.nameRow = nameRow;
        this.idSeat = idSeat;
        this.seatType = seatType;
    }
}
