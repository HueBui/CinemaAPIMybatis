package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.mapper.MovieActorDirectoryCategoryInfoMapper;
import com.dts.CinemaAPI.domain.mapper.MovieListAllMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieCustomRepo {
    List<MovieActorDirectoryCategoryInfoMapper> listAllInfoMovie(String id);
}
