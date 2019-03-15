package com.dts.CinemaAPI.domain.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Mapper;


@Getter
@Setter
@ToString
public class ShowtimeMapper {
    private String idShowtime;
    private String dateShow;
    private String frameTime;
    private String movieName;
    private String nameCinema;

}
