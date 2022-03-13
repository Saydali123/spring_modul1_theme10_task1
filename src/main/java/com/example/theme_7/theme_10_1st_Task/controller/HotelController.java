package com.example.theme_7.theme_10_1st_Task.controller;

import com.example.theme_7.theme_10_1st_Task.Room;
import com.example.theme_7.theme_10_1st_Task.repository.RoomRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Saydali Murodullayev, Sun 1:10 PM. 3/13/2022
 */
@RestController
@RequestMapping
public record HotelController(RoomRepository roomRepository) {

    @RequestMapping(value = "/hotel/{id}", method = RequestMethod.GET)
    public List<Room> getAllRoomsById(@PathVariable Integer id,
                                      @RequestParam(name = "size", defaultValue = "10") Short size,
                                      @RequestParam(name = "page", defaultValue = "0") Short page) {
        Pageable pageable = PageRequest.of(page, size);
        return roomRepository.findAllByHotel_Id(id, pageable);
    }


}
