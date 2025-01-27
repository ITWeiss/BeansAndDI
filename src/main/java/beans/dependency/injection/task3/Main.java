package beans.dependency.injection.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        UserService userService1 = context.getBean(UserService.class);
        UserService userService2 = context.getBean(UserService.class);

        System.out.println(userService1 == userService2);

        userService1.printUsers();
        userService2.printUsers();
    }
}
