package com.dts.CinemaAPI.service;

import com.dts.CinemaAPI.domain.mapper.CinemaMapper;
import com.dts.CinemaAPI.domain.mapper.CinemaShowtimeMapper;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface CinemaService {
    GetListResponse<CinemaMapper> listAllCinema();
    GetListResponse<CinemaShowtimeMapper> listAllShowtimeCinema(String idcinema);


}

