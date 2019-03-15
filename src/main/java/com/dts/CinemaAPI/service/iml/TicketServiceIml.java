package com.dts.CinemaAPI.service.iml;

import com.dts.CinemaAPI.domain.entities.Booking;
import com.dts.CinemaAPI.domain.mapper.TicketMapper;
import com.dts.CinemaAPI.domain.repositories.TicketRepo;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.TicketService;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceIml implements TicketService {
    @Autowired
    private TicketRepo ticketRepo;
    @Override
    public GetListResponse<TicketMapper> showPriceTicketSeat(String idshowtime, String idseat) {
        GetListResponse<TicketMapper> response = new GetListResponse<>();
        List<TicketMapper> list = ticketRepo.showPriceTicketSeat(idshowtime,idseat);
        response.setSuccess(list,list.size());
        return response;

    }

    @Override
    public BaseResponse booking(Booking booking) {
        BaseResponse response = new BaseResponse();

        return response;

    }
}
