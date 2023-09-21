package HW3;

import org.example.HW3.tdd.User;
import org.example.HW3.tdd.UserRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestUserRepository {

    @Test
    void testLogOutUser(){
        User first = new User("Ivan", "admin123", true);
        first.authenticate("Ivan", "admin123");
        User second = new User("Andrey", "anddna", false);
        second.authenticate("Andrey", "anddna");
        User third = new User("Oleg", "superpass", false);
        third.authenticate("Oleg", "superpass");

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(first);
        userRepository.addUser(second);
        userRepository.addUser(third);

        userRepository.logOutUser();

        assertThat(userRepository.getData().get(0)).isEqualTo(first);
    }
}
