package beans.dependency.injection.task4;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public String getUser() {
        return "User1";
    }
}
