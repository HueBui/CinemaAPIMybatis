package com.dts.CinemaAPI.domain.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Getter
@Setter
@ToString
public class MovieListAllMapper {
    private String idMove;
    private String nameMovie;
    private int duration;
    private String image;
    private Date start;
    private String type;
    private String status;
}
