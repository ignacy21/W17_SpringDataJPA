package pl.zajavka.zajavkastore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.zajavkastore.business.*;
import pl.zajavka.zajavkastore.infrastructure.configuration.ApplicationConfiguration;

public class ZajavkaStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        SortingService sortingService = context.getBean(SortingService.class);
        PaginationService paginationService = context.getBean(PaginationService.class);

//        sortingService.call();
        paginationService.call();
    }
}
