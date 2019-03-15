package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.entities.Booking;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookingRepo {
    Integer booking(String idbooking,String idticket,String iduser,String status);
}
