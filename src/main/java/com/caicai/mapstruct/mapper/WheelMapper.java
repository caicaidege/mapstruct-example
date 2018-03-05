package com.caicai.mapstruct.mapper;

import com.caicai.mapstruct.domain.Wheel;
import com.caicai.mapstruct.dto.WheelDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午5:11
 **/
@Mapper
public interface WheelMapper {

    WheelMapper INSTANCE = Mappers.getMapper( WheelMapper.class );

    WheelDto wheelToWheelDto(Wheel wheel);

    List<WheelDto> wheelToWheelDtoList(List<Wheel> wheels);

}
