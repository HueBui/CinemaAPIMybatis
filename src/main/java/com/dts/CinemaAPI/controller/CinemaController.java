package com.dts.CinemaAPI.controller;

import com.dts.CinemaAPI.domain.mapper.CinemaMapper;
import com.dts.CinemaAPI.domain.mapper.CinemaShowtimeMapper;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.iml.CinemaServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    @Autowired
    private CinemaServiceIml cinemaServiceIml;

    @GetMapping("/listAllCinema")
    public GetListResponse<CinemaMapper> listAllCinema(){
        GetListResponse<CinemaMapper> response = cinemaServiceIml.listAllCinema();
        return response;
    }

    @GetMapping("/listAllShowtimeCinema")
    public GetListResponse<CinemaShowtimeMapper> listAllShowtimeCinema(@RequestParam String idcinema){
        GetListResponse<CinemaShowtimeMapper> response = cinemaServiceIml.listAllShowtimeCinema(idcinema);
        return response;
    }
}
