package main.java.edu.sjsu.assasins.hotelbooking.customer;


import edu.sjsu.assasins.hotelbooking.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> hello() {
        return customerService.hello();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) throws NoSuchAlgorithmException {
        try {
            customerService.register(customer);
            return ResponseEntity.status(HttpStatus.OK).body("success");
        }
        catch (Exception e) {
            System.out.println("error while registering");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("invalid credentials");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Object> loginCustomer(@RequestBody Customer customer) throws NoSuchAlgorithmException {
        try {
            Customer loggedincustomer = customerService.login(customer);
            return ResponseEntity.status(HttpStatus.OK).body(loggedincustomer);
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("invalid credentials");
        }
    }
}
