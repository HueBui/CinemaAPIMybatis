package com.dts.CinemaAPI.service;

import com.dts.CinemaAPI.domain.entities.Booking;
import com.dts.CinemaAPI.domain.mapper.TicketMapper;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;

import java.util.List;

public interface TicketService {
    GetListResponse<TicketMapper> showPriceTicketSeat(String idshowtime, String idseat);
    BaseResponse booking(Booking booking);
}
