package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.mapper.MovieListAllMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MovieListAllCustomRepo {
    List<MovieListAllMapper> listAllMovie();
    List<MovieListAllMapper> findMovieByName(String name);
}
