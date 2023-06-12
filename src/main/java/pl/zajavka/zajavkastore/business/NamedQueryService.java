package pl.zajavka.zajavkastore.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.CustomerDatabaseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class NamedQueryService {

    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call() {
        List<CustomerEntity> allCustomers = customerDatabaseRepository.findAllCustomers();
        System.out.println("###ALL: " + allCustomers);

        CustomerEntity customerByEmail = customerDatabaseRepository.findCustomerByEmail("bstilwell1k@deliciousdays.com");
        System.out.println("###CBE: " + customerByEmail);

        List<CustomerEntity> allCustomersNNQ = customerDatabaseRepository.findAllCustomersNNQ();
        System.out.println("###ALL: " + allCustomersNNQ);
    }
}
