package edu.sfsu.assasins.hotelbooking.hotel;

import edu.sfsu.assasins.hotelbooking.models.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface HotelRepository extends CrudRepository<Hotel,Integer> {

}
