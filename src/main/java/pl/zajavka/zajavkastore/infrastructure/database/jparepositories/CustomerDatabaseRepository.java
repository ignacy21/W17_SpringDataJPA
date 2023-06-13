package pl.zajavka.zajavkastore.infrastructure.database.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDatabaseRepository extends JpaRepository<CustomerEntity, Integer> {
    // NQ, NNQ
    List<CustomerEntity> findAllCustomers();
    CustomerEntity findCustomerByEmail(String mail);
    List<CustomerEntity> findAllCustomersNNQ();

    CustomerEntity findByEmail(String email);
    Optional<CustomerEntity> findByCustomerId(Integer id);
    List<CustomerEntity> findByNameOrEmail(String name, String email);
    List<CustomerEntity> findByNameAndEmail(String name, String email);
    CustomerEntity findDistinctByEmail(String email);

}
