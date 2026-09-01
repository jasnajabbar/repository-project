package customer.repository;

import customer.dto.CustomerDto;
import customer.entity.CustomerEntity;

public interface CustomerRepo {
    CustomerDto getCustomer(Integer customerId);
    void createCustomer(CustomerEntity customerEntity);
//    CustomerDto deleteCustomer(Integer customerId);
}
