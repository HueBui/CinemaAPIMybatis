package com.dts.CinemaAPI.domain.repositories;

import com.dts.CinemaAPI.domain.request.ShowtimeRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ShowtimeRepo {
    Integer createShowTime(ShowtimeRequest request);
}
