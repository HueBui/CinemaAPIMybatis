package com.dts.CinemaAPI.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.sql.Timestamp;

public class ShowtimeRequest {
    @JsonProperty("id_showtime")
    private String idShowtime;
    @JsonProperty("date_show")
    private Timestamp dateShow;
    @JsonProperty("frame_time")
    private int frameTime;
    @JsonProperty("id_room")
    private String idRoom;
    @JsonProperty("id_cinema")
    private String idCinema;
    @JsonProperty("id_movie")
    private String idMovie;

    public String getIdShowtime() {
        return idShowtime;
    }

    public void setIdShowtime(String idShowtime) {
        this.idShowtime = idShowtime;
    }

    public Timestamp getDateShow() {
        return dateShow;
    }

    public void setDateShow(Timestamp dateShow) {
        this.dateShow = dateShow;
    }

    public int getFrameTime() {
        return frameTime;
    }

    public void setFrameTime(int frameTime) {
        this.frameTime = frameTime;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(String idCinema) {
        this.idCinema = idCinema;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }
}
