package customer.dto;
import customer.enumm.CustomerEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class CustomerDto {
    private int customerId;
    private String customerName;

    @Enumerated(EnumType.STRING)
    private CustomerEnum customerType;
}
