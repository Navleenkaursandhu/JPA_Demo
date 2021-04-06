package jpa.demo.learning.project.repo;

import jpa.demo.learning.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
