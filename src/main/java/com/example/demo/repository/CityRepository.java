package com.example.demo.repository;

import com.example.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  CityRepository extends JpaRepository<City,Long> {
    List<City> findByName(String name);

    @Query("select c from City c where c.name=:name and c.isUse=:isUse")
    List<City> withNameAndIsUseQuery(@Param("name")String name, @Param("isUse")Boolean isUse);
}
