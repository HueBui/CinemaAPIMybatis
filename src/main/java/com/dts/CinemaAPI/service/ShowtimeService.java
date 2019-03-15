package com.dts.CinemaAPI.service;

import com.dts.CinemaAPI.domain.mapper.ShowtimeMapper;
import com.dts.CinemaAPI.domain.mapper.ShowtimeSeatMapper;
import com.dts.CinemaAPI.domain.request.ShowtimeRequest;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;

import java.sql.Timestamp;
import java.util.Date;

public interface ShowtimeService {
    GetListResponse<ShowtimeMapper> listShowtimeByMovieCinema(String idmovie, String idcinema);
    GetListResponse<ShowtimeSeatMapper> listShowtimeSeat(String idshowtime);
    BaseResponse createShowtime(ShowtimeRequest request);
}
