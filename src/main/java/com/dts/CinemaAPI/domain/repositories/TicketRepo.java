package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.entities.Ticket;
import com.dts.CinemaAPI.domain.mapper.TicketMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TicketRepo {
    Integer createTicket(Ticket ticket);
    List<TicketMapper> showPriceTicketSeat(String idshowtime,String idseat);
}
