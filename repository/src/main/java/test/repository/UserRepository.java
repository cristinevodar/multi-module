package test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import test.entity.User;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User,String> {
    List<User> findByUsername(String username);
}
