package customer.entity;

import customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerUtil implements CommandLineRunner {

    @Autowired
    CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        customerService.createCustomer();
        customerService.findById(1);
//        customerService.deleteCustomer(1);
    }
}
