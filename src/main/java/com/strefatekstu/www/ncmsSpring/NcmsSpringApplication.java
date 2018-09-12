package com.strefatekstu.www.ncmsSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.strefatekstu.www.ncmsSpring.repositories.ArticleRepository;

@SpringBootApplication
public class NcmsSpringApplication {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(NcmsSpringApplication.class, args);
    }

}
