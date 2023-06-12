package pl.zajavka.zajavkastore.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.*;

@Service
@AllArgsConstructor
public class SomeService {

    private final CustomerDatabaseRepository customerDatabaseRepository;
    private final OpinionDatabaseRepository opinionDatabaseRepository;
    private final ProducerDatabaseRepository producerDatabaseRepository;
    private final ProductDatabaseRepository productDatabaseRepository;
    private final PurchaseDatabaseRepository purchaseDatabaseRepository;

    public void call() {
//        System.out.println("#findByEmail(): " + customerDatabaseRepository.findByEmail("nprati1m@exblog.jp"));
//        System.out.println("#findByCustomerId(): " + customerDatabaseRepository.findByCustomerId(45));
//        System.out.println("#findByNameOrEmail(): " + customerDatabaseRepository.findByNameOrEmail("Florian", "cwrightson1a@netvibes.com"));
//        System.out.println("#findByNameOrEmail(): " + customerDatabaseRepository.findByNameOrEmail("Florian", "fjertz15@amazon.cuk"));
//        System.out.println("#findDistinctByEmail(): " + customerDatabaseRepository.findDistinctByEmail("nprati1m@exblog.jp"));
    }
}
