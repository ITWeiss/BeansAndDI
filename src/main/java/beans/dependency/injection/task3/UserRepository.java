package beans.dependency.injection.task3;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserRepository {
    public List<String> getUsers() {
        return Arrays.asList("User1", "User2", "User3");
    }
}
