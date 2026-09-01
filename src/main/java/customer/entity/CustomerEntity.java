package customer.entity;

import customer.enumm.CustomerEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@ToString
public class CustomerEntity {

    @Id
    private int customerId;
    private String customerName;

    @Enumerated(EnumType.STRING)
    private CustomerEnum customerType;
}
