package main.java.edu.sfsu.assasins.hotelbooking.price;

import edu.sfsu.assasins.hotelbooking.models.Price;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends MongoRepository<Price, Integer> {
    List<Price> findAll();
    Price findById(String id);
    Price deleteById(String id);
    Boolean existsPriceById(String id);
}
