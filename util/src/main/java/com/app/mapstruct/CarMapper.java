package com.app.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDTO carToCarDTO(Car car);
}