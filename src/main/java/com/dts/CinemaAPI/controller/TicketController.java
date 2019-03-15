package com.dts.CinemaAPI.controller;

import com.dts.CinemaAPI.domain.entities.Booking;
import com.dts.CinemaAPI.domain.mapper.TicketMapper;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.TicketService;
import com.dts.CinemaAPI.service.iml.TicketServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketServiceIml ticketServiceIml;

    @GetMapping("/showPriceTicket")
    public GetListResponse<TicketMapper> showPriceTiket(@RequestParam String idshowtime, @RequestParam String idseat){
        GetListResponse<TicketMapper> response = ticketServiceIml.showPriceTicketSeat(idshowtime,idseat);
        return response;
    }

    @PostMapping("/booking")
    public BaseResponse booking(@RequestBody Booking request){
        return ticketServiceIml.booking(request);
    }
}
