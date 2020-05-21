package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import test.repository.UserRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserCrudTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldPerformCrudOperations() {
        final User user=new User();
        user.setFirstName("Andrei");
        user.setLastName("Marin");
        user.setPassword("alabala3");
        user.setNickname("Andreiut");

        userRepository.save(user);
        assertThat(userRepository.findAll())
                .hasSize(1)
                .first()
                .isEqualToComparingFieldByField(user);

    }
}
