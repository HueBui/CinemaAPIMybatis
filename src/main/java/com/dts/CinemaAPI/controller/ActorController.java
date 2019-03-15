package com.dts.CinemaAPI.controller;

import com.dts.CinemaAPI.domain.entities.Actor;
import com.dts.CinemaAPI.domain.repositories.ActorRepo;
import com.dts.CinemaAPI.domain.response.GetListResponse;
import com.dts.CinemaAPI.service.iml.ActorServiceIml;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class ActorController {
    @Autowired
    private ActorServiceIml actorServiceIml;
    @Autowired
    private ActorRepo actorRepo;
    @GetMapping("/pages")
    public GetListResponse<Actor> findByPage(@RequestParam int start, int limit){
        GetListResponse response = actorServiceIml.findByPage(start,limit);
        return response;
    }
}
