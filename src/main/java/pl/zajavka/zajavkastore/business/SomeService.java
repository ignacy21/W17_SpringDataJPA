package pl.zajavka.zajavkastore.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.OpinionEntity;
import pl.zajavka.zajavkastore.infrastructure.database.entity.Stars;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.*;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SomeService {

    private final CustomerDatabaseRepository customerDatabaseRepository;
    private final OpinionDatabaseRepository opinionDatabaseRepository;
    private final ProducerDatabaseRepository producerDatabaseRepository;
    private final ProductDatabaseRepository productDatabaseRepository;
    private final PurchaseDatabaseRepository purchaseDatabaseRepository;

    @Transactional
    public void call() {
//        System.out.println(opinionDatabaseRepository.findByCustomerEmail("nprati1m@exblog.jp"));
//        System.out.println(opinionDatabaseRepository.countWrongOpinions());
//        opinionDatabaseRepository.updateWrongOpinions(Stars.FIVE, Set.of(Stars.ONE, Stars.TWO, Stars.THREE));
//        System.out.println(opinionDatabaseRepository.countWrongOpinions());
//        System.out.println("####");
//        System.out.println(opinionDatabaseRepository.countOpinion());
//        System.out.println("####");
//        System.out.println(opinionDatabaseRepository.countOpinion());
//        opinionDatabaseRepository.deleteOpinionsContaining("ppgo");
//        System.out.println(opinionDatabaseRepository.countOpinion());
        System.out.println(opinionDatabaseRepository.countMaxStars());
    }
}
