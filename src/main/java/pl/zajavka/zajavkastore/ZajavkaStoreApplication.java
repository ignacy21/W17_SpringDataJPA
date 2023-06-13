package pl.zajavka.zajavkastore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.zajavkastore.business.EntityGraphService;
import pl.zajavka.zajavkastore.business.NamedQueryService;
import pl.zajavka.zajavkastore.business.QueryByExampleService;
import pl.zajavka.zajavkastore.business.SomeService;
import pl.zajavka.zajavkastore.infrastructure.configuration.ApplicationConfiguration;

public class ZajavkaStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        NamedQueryService namedQueryService = context.getBean(NamedQueryService.class);
        QueryByExampleService queryByExampleService = context.getBean(QueryByExampleService.class);
        SomeService someService = context.getBean(SomeService.class);
        EntityGraphService entityGraphService = context.getBean(EntityGraphService.class);

        entityGraphService.call();
    }
}
