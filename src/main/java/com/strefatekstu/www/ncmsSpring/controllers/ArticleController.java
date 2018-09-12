package com.strefatekstu.www.ncmsSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strefatekstu.www.ncmsSpring.entites.Article;
import com.strefatekstu.www.ncmsSpring.repositories.ArticleRepository;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/article")
    public List<Article> getArticle(Model model) {
        return articleRepository.findAll();
    }
}
