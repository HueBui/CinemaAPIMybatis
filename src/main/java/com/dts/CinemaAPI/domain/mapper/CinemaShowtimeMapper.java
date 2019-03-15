package com.dts.CinemaAPI.domain.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CinemaShowtimeMapper {
    private String idShowtime;
    private String dateShow;
    private String frameTime;
    private String nameMovie;

}
