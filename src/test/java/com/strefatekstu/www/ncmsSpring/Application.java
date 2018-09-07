package com.strefatekstu.www.ncmsSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private ArticleRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        repository.save(new Article("uno", "Kamil", "content", "subtitle", "11"));
        repository.save(new Article("dos", "Kamil", "second content", "second subtitle", "12"));

        System.out.println("Articles found with findAll");
        System.out.println("---------------------------");

        for (Article article : repository.findAll()) {
            System.out.println(article.title);
        }
    }
}
