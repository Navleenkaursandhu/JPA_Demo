package jpa.demo.learning.project.service;

import jpa.demo.learning.project.repo.BlogRepo;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private BlogRepo repo;

    public BlogService(BlogRepo repo) {
        this.repo = repo;
    }
}
