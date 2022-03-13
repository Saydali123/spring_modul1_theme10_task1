package com.example.theme_7.theme_10_1st_Task.repository;

import com.example.theme_7.theme_10_1st_Task.Room;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Saydali Murodullayev, Sun 1:08 PM. 3/13/2022
 */
public interface RoomRepository extends JpaRepository<Room, Integer> {

    List<Room> findAllByHotel_Id(Integer hotel_id, Pageable p);

}
