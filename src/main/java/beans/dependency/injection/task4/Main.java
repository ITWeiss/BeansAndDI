package beans.dependency.injection.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        OrderService orderService1 = context.getBean(OrderService.class);
        orderService1.printUser();
        orderService1.printOrder();

        OrderService orderService2 = context.getBean(OrderService.class);

        System.out.println(orderService1 == orderService2);
    }
}
