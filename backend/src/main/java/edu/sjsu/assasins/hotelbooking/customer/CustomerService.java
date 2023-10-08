package main.java.edu.sjsu.assasins.hotelbooking.customer;

import edu.sjsu.assasins.hotelbooking.models.Customer;
import edu.sjsu.assasins.hotelbooking.util.SHA512Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    private final SHA512Hasher sha512Hasher = new SHA512Hasher();

    public List<Customer> hello() {
        return customerRepository.findAll();
    }


    public void register(Customer customer) throws NoSuchAlgorithmException {
        List<Customer> customerByEmail =  customerRepository.findByEmail(customer.getEmail());
        if(customerByEmail.size() != 0) throw new IllegalStateException("email taken");
        else {
            System.out.println(customer.getPassword());
            String securePassword = sha512Hasher.hash(customer.getPassword());
            System.out.println(securePassword);
            customer.setPassword(securePassword);
            customerRepository.save(customer);
        }

    }

    public Customer login(Customer customer) {
        List<Customer> customerByEmail =  customerRepository.findByEmail(customer.getEmail());
        System.out.println(customerByEmail.size());
        if(customerByEmail.size() == 0) throw new IllegalStateException("email taken");
        else {
            if(sha512Hasher.checkPassword(customerByEmail.get(0).getPassword(), customer.getPassword())) return customerByEmail.get(0);
            else throw new IllegalStateException("invalid password");
        }
    }
}
