package com.strefatekstu.www.ncmsSpring;

import com.strefatekstu.www.ncmsSpring.entites.Article;
import com.strefatekstu.www.ncmsSpring.repositories.ArticleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NcmsSpringApplication {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(NcmsSpringApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            articleRepository.save(new Article("title1", "kamil", "content1"));
            articleRepository.save(new Article("title2", "kamil2", "content12"));
            articleRepository.save(new Article("title3", "kamil", "content super"));
        };
    }
}
