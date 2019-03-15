package com.dts.CinemaAPI.service;

import com.dts.CinemaAPI.domain.mapper.MovieActorDirectoryCategoryInfoMapper;
import com.dts.CinemaAPI.domain.mapper.MovieListAllMapper;
import com.dts.CinemaAPI.domain.response.GetListResponse;

public interface MovieService {
   GetListResponse<MovieActorDirectoryCategoryInfoMapper> listAllInfoMovie(String id);
   GetListResponse<MovieListAllMapper> listAllMovie();
   GetListResponse<MovieListAllMapper> findMovieByName(String name);
}
