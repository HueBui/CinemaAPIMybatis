package com.dts.CinemaAPI.service.iml;

import com.dts.CinemaAPI.domain.mapper.CinemaMapper;
import com.dts.CinemaAPI.domain.mapper.CinemaShowtimeMapper;
import com.dts.CinemaAPI.domain.repositories.CinemaCustomRepo;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class CinemaServiceIml implements CinemaService {
    @Autowired
    private CinemaCustomRepo cinemaCustomRepo;

    @Override
    public GetListResponse<CinemaMapper> listAllCinema() {
        GetListResponse<CinemaMapper> response = new GetListResponse<>();
        List<CinemaMapper> list = cinemaCustomRepo.listAllCinema();
        response.setSuccess(list,list.size());
        return response;
    }

    @Override
    public GetListResponse<CinemaShowtimeMapper> listAllShowtimeCinema(String idcinema) {
        GetListResponse<CinemaShowtimeMapper> response  =  new GetListResponse<>();
        List<CinemaShowtimeMapper> list = cinemaCustomRepo.listAllShowtimeCinemas(idcinema);
        response.setSuccess(list,list.size());
        return response;
    }
}
