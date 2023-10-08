package edu.sjsu.assasins.hotelbooking.hotel;


import edu.sjsu.assasins.hotelbooking.models.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public void addhotel(Hotel h){
        hotelRepository.save(h);
    }
    public Optional<Hotel> searchhotel(int i){
       return hotelRepository.findById(i);
    }
    public void deletehotel(int i){
        hotelRepository.deleteById(i);
    }
    public List<Hotel> showallhotels(){
        List<Hotel> hotels = new ArrayList<>();
        hotelRepository.findAll().forEach(hotels::add);
        return hotels;
    }
}
