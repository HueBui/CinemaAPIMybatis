package com.dts.CinemaAPI.service.iml;

import com.dts.CinemaAPI.domain.entities.Actor;
import com.dts.CinemaAPI.domain.repositories.ActorRepo;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.ActorService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class ActorServiceIml implements ActorService {
    @Autowired
    private ActorRepo actor;

    @Override
    public GetListResponse<Actor> findByPage(int start, int limit) {
        GetListResponse<Actor> response = new GetListResponse<>();
        List<Actor> list = actor.findByRows(start,limit);
        response.setSuccess(list,list.size());
        return response;
    }
}
