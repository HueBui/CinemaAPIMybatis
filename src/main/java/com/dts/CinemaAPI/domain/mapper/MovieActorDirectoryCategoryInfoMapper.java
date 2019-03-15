package com.dts.CinemaAPI.domain.mapper;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
public class MovieActorDirectoryCategoryInfoMapper {
    private String idMove;
    private String nameMovie;
    private String discription;
    private int duration;
    private String image;
    private String language;
    private String rated;
    private Date start;
    private String trailer;
    private String nameActor;
    private String nameDirectory;
    private String type;
}
