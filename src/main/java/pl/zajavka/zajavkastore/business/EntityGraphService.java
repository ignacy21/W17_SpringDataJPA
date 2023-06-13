package pl.zajavka.zajavkastore.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.CustomerDatabaseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EntityGraphService {

    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call() {
        CustomerEntity customer = customerDatabaseRepository.findByEmail("nprati1m@exblog.jp");
//        CustomerEntity customer = customerDatabaseRepository.findByCustomerId(59).orElseThrow();
        System.out.println(customer.getPurchaseEntities());
    }
}
