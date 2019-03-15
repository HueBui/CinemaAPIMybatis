package com.dts.CinemaAPI.controller;

import com.dts.CinemaAPI.domain.mapper.MovieActorDirectoryCategoryInfoMapper;
import com.dts.CinemaAPI.domain.mapper.MovieListAllMapper;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.iml.MovieServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieServiceIml movieServiceIml;

    @GetMapping("/listMovieInfo")
    public GetListResponse<MovieActorDirectoryCategoryInfoMapper> listAllMovieInfo(@RequestParam String id){
        GetListResponse<MovieActorDirectoryCategoryInfoMapper> listResponse = movieServiceIml.listAllInfoMovie(id);
        return listResponse;
    }

    @GetMapping("/listAllMovie")
    public GetListResponse<MovieListAllMapper> listAllMovie(){
        GetListResponse<MovieListAllMapper> listResponse = movieServiceIml.listAllMovie();
        return listResponse;
    }

    @GetMapping("/findMovieByName")
    public GetListResponse<MovieListAllMapper> findMovieByName(@RequestParam String name){
        GetListResponse<MovieListAllMapper> listResponse = movieServiceIml.findMovieByName(name);
        return listResponse;
    }
}
