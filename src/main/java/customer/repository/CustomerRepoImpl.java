package customer.repository;
import customer.dto.CustomerDto;
import customer.entity.CustomerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepoImpl implements CustomerRepo {

    @PersistenceContext
    private EntityManager em;
    @Autowired
    CustomerDto customerDto;

    @Override
    public void createCustomer(CustomerEntity customerEntity) {
        em.persist(customerEntity);
    }

    @Override
    public CustomerDto getCustomer(Integer customerId) {
        CustomerEntity customer=em.find(CustomerEntity.class,customerId);
        customerDto.setCustomerId(customer.getCustomerId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerType(customer.getCustomerType());
        return customerDto;
    }

//    @Override
//    public CustomerDto deleteCustomer(Integer customerId) {
//        CustomerEntity customer=em.remove(CustomerEntity.class,customerId);
//    }


}
