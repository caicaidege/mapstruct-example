package com.caicai.mapstruct.dto;


import lombok.Data;

import java.util.List;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午4:36
 **/
@Data
public class CarDto {

    private String make;
    private int seatCount;
    private String type;


    private String name;

    private OwnerDto ownerDto;

    private List<WheelDto> wheelDtoList;

}
