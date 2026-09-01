package customer.service;

import customer.dto.CustomerDto;
import customer.entity.CustomerEntity;
import customer.entity.CustomerUtil;
import customer.enumm.CustomerEnum;
import customer.repository.CustomerRepoImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepoImpl customerRepo;

    @Autowired
    CustomerDto customerDto;

    @Transactional
    public void createCustomer(){
        CustomerEntity customer = new CustomerEntity();
        customer.setCustomerId(1);
        customer.setCustomerName("Jasna");
        customer.setCustomerType(CustomerEnum.DIAMOND);
        System.out.println("Create Customer "+customer);
        customerRepo.createCustomer(customer);
    }

    @Transactional
    public void findById(int customerId){
        customerDto= customerRepo.getCustomer(customerId);
                System.out.println("Get Customer "+customerDto);
    }

//    @Transactional
//    public void deleteCustomer(int customerId){
//        customerDto=customerRepo.deleteCustomer(customerId);
//        System.out.println("Delete Customer"+customerDto);
//    }
}
