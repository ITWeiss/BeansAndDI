package beans.dependency.injection.task4;

import org.springframework.stereotype.Component;

@Component
public class OrderRepository {
    public String getOrder() {
        return "Order1";
    }
}
