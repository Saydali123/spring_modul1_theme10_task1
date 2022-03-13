package com.example.theme_7.entity.repository;

import com.example.theme_7.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Saydali Murodullayev, Mon 10:43 AM. 3/7/2022
 */
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findAllByRegion_Id(Long region_id);

}
