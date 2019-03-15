package com.dts.CinemaAPI.service.iml;

import com.dts.CinemaAPI.domain.entities.Ticket;
import com.dts.CinemaAPI.domain.mapper.ShowtimeMapper;
import com.dts.CinemaAPI.domain.mapper.ShowtimeSeatMapper;
import com.dts.CinemaAPI.domain.repositories.ShowtimeCustomRepo;
import com.dts.CinemaAPI.domain.repositories.ShowtimeRepo;
import com.dts.CinemaAPI.domain.repositories.TicketRepo;
import com.dts.CinemaAPI.domain.request.ShowtimeRequest;
import com.dts.CinemaAPI.domain.response.BaseResponse;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class ShowtimeServiceIml implements ShowtimeService {
    @Autowired
    private ShowtimeCustomRepo showtimeCustomRepo;

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ShowtimeRepo showtimeRepo;

    @Override
    public GetListResponse<ShowtimeMapper> listShowtimeByMovieCinema(String idmovie, String idcinema) {
        GetListResponse<ShowtimeMapper> response = new GetListResponse<>();
        List<ShowtimeMapper> list = showtimeCustomRepo.listShowtimeByMovieCinema(idmovie,idcinema);
        response.setSuccess(list,list.size());
        return  response;
    }

    @Override
    public GetListResponse<ShowtimeSeatMapper> listShowtimeSeat(String idshowtime) {
        GetListResponse<ShowtimeSeatMapper> response = new GetListResponse<>();
        List<ShowtimeSeatMapper> list = showtimeCustomRepo.listShowtimeSeat(idshowtime);
        response.setSuccess(list,list.size());
        return  response;
    }

    @Override
    public BaseResponse createShowtime(ShowtimeRequest request) {
        BaseResponse response = new BaseResponse();
        try {
            showtimeRepo.createShowTime(request);
            Ticket ticket = new Ticket();
            List<ShowtimeSeatMapper> showtimeSeatMapperList = showtimeCustomRepo.listShowtimeSeat(request.getIdShowtime());
            for (int i=0; i<showtimeSeatMapperList.size(); i++) {
                ticket.setIdticket(UUID.randomUUID().toString());
                ticket.setIdshowtime(request.getIdShowtime());
                ticket.setIdseat(showtimeSeatMapperList.get(i).getIdSeat());
                if (Integer.parseInt(showtimeSeatMapperList.get(i).getSeatType())==0){
                    ticket.setPrice(100);
                }
                else if (Integer.parseInt(showtimeSeatMapperList.get(i).getSeatType())==0){
                    ticket.setPrice(100+20);
                }
                else {
                    ticket.setPrice(100+30);
                }
                ticketRepo.createTicket(ticket);
            }
            response.setSuccess();
        }catch (Exception ex){
            response.setFailed(ex.getLocalizedMessage());
        }
        return response;
    }
}
