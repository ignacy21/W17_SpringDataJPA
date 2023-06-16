package pl.zajavka.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import pl.zajavka.infrastructure.database.jparepositories.EmployeeDataJpaRepository;
import pl.zajavka.infrastructure.database.model.EmployeeEntity;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeDataJpaRepository employeeRepository;

    public EmployeeEntity create(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }


    @Transactional
    public EmployeeEntity find(final Integer employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Employee with id: [%s] doesn't exist", employeeId)
                ));
    }
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Transactional
    public EmployeeEntity find(final String name, final String surname) {
        return employeeRepository.findByNameAndSurname(name, surname)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Employee with name: [%s], surname[%s] doesn't exist", name, surname)
                ));
    }

    @Transactional
    public void delete(final String name, final String surname) {
        employeeRepository.deleteByNameAndSurname(name, surname);
    }

    public void deleteAll() {
        employeeRepository.deleteAll();
    }
}
