package jpa.demo.learning.project.service;

import jpa.demo.learning.project.entity.User;
import jpa.demo.learning.project.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public User addUser(User user){
        return repo.save(user);
    }
}
