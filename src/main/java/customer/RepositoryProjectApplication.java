package customer;
import customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositoryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositoryProjectApplication.class, args);
	}

}
