package com.codingshuttle.projects.airBnbApp.service;

import com.codingshuttle.projects.airBnbApp.dto.HotelDto;
import com.codingshuttle.projects.airBnbApp.dto.HotelPriceDto;
import com.codingshuttle.projects.airBnbApp.dto.HotelSearchRequest;
import com.codingshuttle.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);


    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
