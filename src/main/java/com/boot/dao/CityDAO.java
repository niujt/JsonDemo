package com.boot.dao;

import com.boot.entity.City;
import org.apache.ibatis.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@Mapper
public interface CityDAO {
    @Select("select count(1) from city")
    int getCount();
    @Select("select * from city")
    List<City> findAll();

    @Select("select * from city where id=#{id}")
    City findById(Integer id);

    @Insert("insert into city(name,state) values(#{name},#{state})")
    int addCity(City city);

    @Update("update city set name=#{name},state=#{state} where id=#{id}")
    int updateCityById(City city);

    @Delete("delete from city where id=#{id}")
    int deleteCityByid(Integer id);
}
