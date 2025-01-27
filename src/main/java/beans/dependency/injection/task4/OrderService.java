package beans.dependency.injection.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class OrderService {
    private UserRepository userRepository;
    private OrderRepository orderRepository;

    @Autowired
    public OrderService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void printUser() {
        System.out.println(userRepository.getUser());
    }

    public void printOrder() {
        System.out.println(orderRepository.getOrder());
    }
}
