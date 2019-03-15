package com.dts.CinemaAPI.service;

import com.dts.CinemaAPI.domain.entities.Actor;
import com.dts.CinemaAPI.domain.response.GetListResponse;

import java.util.List;

public interface ActorService  {
    GetListResponse<Actor> findByPage(int pageNo, int pageSize);
}
