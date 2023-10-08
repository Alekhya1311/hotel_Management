package main.java.edu.sjsu.assasins.hotelbooking.price;

import edu.sjsu.assasins.hotelbooking.models.ErrorMessage;
import edu.sjsu.assasins.hotelbooking.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    public ResponseEntity<Object> getallpeakprices() {
        try {
            List<Price> l = priceRepository.findAll();
            System.out.println(l.get(0).toString());
            return ResponseEntity.ok(priceRepository.findAll());
        }
        catch (Exception e) {
            System.out.println("error while getting peak prices");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error while finding peak prices");
        }
    }

    public ResponseEntity<Object> addPrice(Price price) {
        try {
            return ResponseEntity.ok(priceRepository.save(price));
        }
        catch (Exception e) {
            System.out.println("error while adding price");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error while adding price");
        }
    }

    public ResponseEntity<Object> getPricebyid(String id) {
        try {
            return ResponseEntity.ok(priceRepository.findById(id));
        }
        catch (Exception e) {
            System.out.println("error while getting price by id");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error while getting price by id");
        }
    }

    public ResponseEntity<Object> deletePricebyid(String id) {
        try {
            return ResponseEntity.ok(priceRepository.deleteById(id));
        }
        catch (Exception e) {
            System.out.println("error while deleting price by id");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error while deleting price by id");
        }
    }

    public ResponseEntity<Object> updatePricebyid(String id, Price price) {
        if (priceRepository.existsPriceById(id)) {
            try {
                Price priceToBeUpdated = priceRepository.findById(id);
                priceToBeUpdated.setFromdate(price.getFromdate());
                priceToBeUpdated.setTodate(price.getTodate());
                priceToBeUpdated.setPercent(price.getPercent());
                priceRepository.save(priceToBeUpdated);
                return ResponseEntity.ok(priceToBeUpdated);
            } catch (Exception e) {
                throw e;
            }
        } else {
            return ResponseEntity.badRequest().body(new ErrorMessage("updating price failed."));
        }
    }
}