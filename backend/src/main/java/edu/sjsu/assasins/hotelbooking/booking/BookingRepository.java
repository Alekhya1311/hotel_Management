package edu.sjsu.assasins.hotelbooking.booking;

import edu.sjsu.assasins.hotelbooking.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    @Query("{userid:'?0'}")
    List<Booking> findByUserId(String userid);

    @Query("{userid:'?0'}")
    List<Booking> getBookingsByUserIdAndRoomId(String userid, String roomid);
}