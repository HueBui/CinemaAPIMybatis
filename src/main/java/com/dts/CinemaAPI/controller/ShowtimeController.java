package com.dts.CinemaAPI.controller;

import com.dts.CinemaAPI.domain.mapper.ShowtimeMapper;
import com.dts.CinemaAPI.domain.mapper.ShowtimeSeatMapper;
import com.dts.CinemaAPI.domain.request.ShowtimeRequest;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.iml.ShowtimeServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("/showtime")
public class ShowtimeController {
    @Autowired
    private ShowtimeServiceIml showtimeServiceIml;

    @GetMapping("/listShowtime")
    public GetListResponse<ShowtimeMapper> listShowtime(@RequestParam String idmovie,
                                                        @RequestParam String idcinema){
        GetListResponse<ShowtimeMapper> response = showtimeServiceIml.listShowtimeByMovieCinema(idmovie,idcinema);
        return response;
    }

    @GetMapping("/listShowtimeSeat")
    public GetListResponse<ShowtimeSeatMapper> listShowtime(@RequestParam String idshowtime){
        GetListResponse<ShowtimeSeatMapper> response = showtimeServiceIml.listShowtimeSeat(idshowtime);
        return response;
    }

    @PostMapping("/createShowtime")
    public BaseResponse createShowtime(@RequestBody ShowtimeRequest showtimeRequest){
        BaseResponse response = showtimeServiceIml.createShowtime(showtimeRequest);
        return response;
    }
}
