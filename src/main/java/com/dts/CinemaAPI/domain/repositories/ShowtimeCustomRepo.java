package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.mapper.ShowtimeMapper;
import com.dts.CinemaAPI.domain.mapper.ShowtimeSeatMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShowtimeCustomRepo {
    List<ShowtimeMapper> listShowtimeByMovieCinema(String idmovie, String idcinema);
    List<ShowtimeSeatMapper> listShowtimeSeat(String idshowtime);
}
