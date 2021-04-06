package jpa.demo.learning.project;

import jpa.demo.learning.project.entity.Blog;
import jpa.demo.learning.project.entity.User;
import jpa.demo.learning.project.repo.BlogRepo;
import jpa.demo.learning.project.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.Instant;
import java.util.List;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		UserService service = context.getBean(UserService.class);

		service.addUser(new User(1L, "Navleen Sandhu", Instant.now(),null ));
		service.addUser(new User(2L, "Harmanjot", Instant.now(), null));

		BlogRepo repo = context.getBean(BlogRepo.class);
		Blog blog = Blog.builder().id(3L).category("Java").blogText("CLOB stands for Character Large Object in general, an SQL Clob is a built-in datatype and is used to store large amount of textual data. Using this datatype, you can store data up to 2,147,483,647 characters.").build();

        Blog b = repo.save(blog);

		System.out.println(b);
		b.setCategory("Devops");
		repo.save(b);

		repo.save(Blog.builder().blogText("adssdcd").category("JAVA").build());
		repo.save(Blog.builder().blogText("schtnbgb").category("JAVA").build());
		repo.save(Blog.builder().blogText("kjnhgb").category("JAVA").build());
		repo.save(Blog.builder().blogText("drgbhngbgh").category("Devops").build());
		repo.save(Blog.builder().blogText("A Character Large OBject (or CLOB) is a collection of character data in a database management system, usually stored in a separate location that is referenced in the table itself.").category("Devops").build());

		System.out.println(repo.findAllByCategory("JAVA"));

		System.out.println(repo.findAllWithMoreThan20());

		System.out.println("count: " + repo.getCount());


	}

}
