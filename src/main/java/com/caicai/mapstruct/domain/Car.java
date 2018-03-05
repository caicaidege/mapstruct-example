package com.caicai.mapstruct.domain;

import lombok.Data;

import java.util.List;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午4:33
 **/
@Data
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;
    /**
     * 包含对象
     */
    private Owner owner;
    /**
     * 包含集合
     */
    private List<Wheel> wheelList;


    public Car(String make, int numberOfSeats, CarType type) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }


}
