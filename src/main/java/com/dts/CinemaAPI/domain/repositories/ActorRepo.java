package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.entities.Actor;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ActorRepo {
    List<Actor> findByRows(int start,int limit);
}
