package com.dts.CinemaAPI.service.iml;

import com.dts.CinemaAPI.domain.mapper.MovieActorDirectoryCategoryInfoMapper;
import com.dts.CinemaAPI.domain.mapper.MovieListAllMapper;
import com.dts.CinemaAPI.domain.repositories.MovieCustomRepo;
import com.dts.CinemaAPI.domain.repositories.MovieListAllCustomRepo;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class MovieServiceIml implements MovieService {
    @Autowired
    private MovieCustomRepo movieCustomRepo;

    @Autowired
    private MovieListAllCustomRepo  movieListAllCustomRepo;
    @Override
    public GetListResponse<MovieActorDirectoryCategoryInfoMapper> listAllInfoMovie(String id) {
        GetListResponse<MovieActorDirectoryCategoryInfoMapper> response = new GetListResponse<>();
        List<MovieActorDirectoryCategoryInfoMapper> re= movieCustomRepo.listAllInfoMovie(id);
        response.setSuccess(re,re.size());

        return response;
    }

    @Override
    public GetListResponse<MovieListAllMapper> listAllMovie() {
        GetListResponse<MovieListAllMapper> response = new GetListResponse<>();
        List<MovieListAllMapper> list = movieListAllCustomRepo.listAllMovie();
        response.setSuccess(list,list.size());
        return  response;
    }

    @Override
    public GetListResponse<MovieListAllMapper> findMovieByName(String name) {
        GetListResponse<MovieListAllMapper> response = new GetListResponse<>();
        List<MovieListAllMapper> list = movieListAllCustomRepo.findMovieByName(name);
        response.setSuccess(list,list.size());
        return  response;
    }
}
