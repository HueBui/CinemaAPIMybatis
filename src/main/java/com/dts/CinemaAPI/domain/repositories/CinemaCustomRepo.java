package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.mapper.CinemaMapper;
import com.dts.CinemaAPI.domain.mapper.CinemaShowtimeMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CinemaCustomRepo {
    List<CinemaMapper> listAllCinema();
    List<CinemaShowtimeMapper> listAllShowtimeCinemas(String idcinema);
}
