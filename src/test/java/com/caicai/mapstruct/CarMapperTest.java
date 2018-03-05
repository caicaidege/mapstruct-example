package com.caicai.mapstruct;

import com.caicai.mapstruct.domain.Car;
import com.caicai.mapstruct.domain.CarType;
import com.caicai.mapstruct.domain.Owner;
import com.caicai.mapstruct.domain.Wheel;
import com.caicai.mapstruct.dto.CarDto;
import com.caicai.mapstruct.mapper.CarMapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengchubin
 * @create 2018-03-01 下午4:39
 **/
public class CarMapperTest {

    @Test
    public void carToCarDto(){
        Car car = new Car("Morris", 5, CarType.SEDAN);
        car.setOwner(new Owner("me"));
        Wheel wheel = new Wheel("lunzi");
        List<Wheel> wheelList = new ArrayList<>();
        wheelList.add(wheel);
        car.setWheelList(wheelList);
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        Assert.assertNotNull(carDto);
        Assert.assertEquals(car.getMake(),carDto.getMake());
        System.out.println(carDto.getName());
        System.out.println(carDto.getOwnerDto().getOwnerName());

        System.out.println(carDto.getWheelDtoList().size());

        //list
        List<Car> carList = new ArrayList<Car>();
        carList.add(car);

        List<CarDto> carDtoList = CarMapper.INSTANCE.carToCarDtoList(carList);
        System.out.println(carDtoList.size());

    }

}
