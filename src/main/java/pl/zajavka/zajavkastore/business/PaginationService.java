package pl.zajavka.zajavkastore.business;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.zajavka.zajavkastore.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.zajavkastore.infrastructure.database.jparepositories.CustomerDatabaseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaginationService {

    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call() {

        int pageSize = 11;
        paginate(0, pageSize);
        paginate(1, pageSize);
        paginate(2, pageSize);
        paginate(4, pageSize);
        paginate(5, pageSize);
        paginate(6, pageSize);
        paginate(7, pageSize);
        paginate(8, pageSize);
        paginate(9, pageSize);
        paginate(10, pageSize);
    }

    private void paginate(int pageNumber, int pageSize) {
        System.out.printf("%n#### PAGINATION. PN: %s, PS: %S ####%n", pageNumber, pageSize);

        Sort sort = Sort.by("name").ascending()
                .and(Sort.by("dateOfBirth").descending());
        PageRequest pageable = PageRequest.of(pageNumber, pageSize, sort);
        Page<CustomerEntity> page = customerDatabaseRepository.findAll(pageable);
        List<CustomerEntity> content = page.getContent();

        if (content.isEmpty()) {
            System.out.println("###PAGE IS EMPTY");
        }

        System.out.println("page.getTotalElements(): " + page.getTotalElements());
        System.out.println("page.getTotalPages(): " + page.getTotalPages());
        System.out.println("page.getNumberOfElements(): " + page.getNumberOfElements());
        System.out.println("page.getSize(): " + page.getSize());
        System.out.println("page.isFirst(): " + page.isFirst());
        System.out.println("page.isLast(): " + page.isLast());
    }
}

