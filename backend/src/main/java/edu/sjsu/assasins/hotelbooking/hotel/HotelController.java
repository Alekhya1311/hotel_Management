package edu.sjsu.assasins.hotelbooking.hotel;

import edu.sjsu.assasins.hotelbooking.models.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping( method = RequestMethod.POST, value="/hotels")
    public String add(@RequestBody Hotel h){
        hotelService.addhotel(h);
        return "Hotel added successfully";
    }

    @RequestMapping( method = RequestMethod.DELETE,value="/hotels/{id}")
    public String del(@PathVariable int id){
        hotelService.deletehotel(Integer.parseInt(String.valueOf(id)));
        return "Hotel deleted successfully";
    }

    @RequestMapping( method = RequestMethod.GET,value="/hotels/{id}")
    public Optional<Hotel> search(@PathVariable int id){
        return hotelService.searchhotel(Integer.parseInt(String.valueOf(id)));
    }
    @RequestMapping(method=RequestMethod.GET,value="/hotels")
    public List<Hotel> showall(){
      return hotelService.showallhotels();
    }

}
