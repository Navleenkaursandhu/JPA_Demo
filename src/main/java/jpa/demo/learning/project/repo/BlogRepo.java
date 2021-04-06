package jpa.demo.learning.project.repo;

import jpa.demo.learning.project.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Long> {
    List<Blog> findAllByCategory (String category);
    @Query("SELECT b FROM Blog b where length(b.blogText)>20") //HQL(Hibernate Query Language) Query
    List<Blog> findAllWithMoreThan20 ();

    @Query(value = "SELECT COUNT(*) FROM Blog", nativeQuery = true)
    Integer getCount();


}
