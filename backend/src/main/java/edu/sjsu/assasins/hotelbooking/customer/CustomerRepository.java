package main.java.edu.sjsu.assasins.hotelbooking.customer;

import edu.sjsu.assasins.hotelbooking.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

//    @Query("{email:'?0'}")
    List<Customer> findByEmail(String email);
}
