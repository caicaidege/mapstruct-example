package com.caicai.mapstruct.mapper;

import com.caicai.mapstruct.domain.Car;
import com.caicai.mapstruct.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午4:37
 **/
@Mapper(uses = {WheelMapper.class})
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(source = "owner.ownerName", target = "ownerDto.ownerName")
    @Mapping(source = "wheelList", target = "wheelDtoList")
    CarDto carToCarDto(Car car);

    List<CarDto> carToCarDtoList(List<Car> carList);

}
