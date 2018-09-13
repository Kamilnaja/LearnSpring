package com.strefatekstu.www.ncmsSpring.controllers;

import com.strefatekstu.www.ncmsSpring.entites.Article;
import com.strefatekstu.www.ncmsSpring.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article")
    public List<Article> getArticle() {
        return articleService.getAllArticles();
    }

    @GetMapping(value = "/article/{id}")
    public Optional<Article> getOneArticle(@PathVariable("id") Integer id) {
        return articleService.getOneArticle(id);
    }

    @PostMapping("/article")
    public List<Article> createArticle(Article article) {
        return articleService.createArticle(article);
    }

    @DeleteMapping(value = "/article/{id}")
    public List<Article> deleteArticle(@PathVariable("id") Integer id) {
        return articleService.deleteArticle(id);
    }

    @PutMapping(value = "/article/{id}")
    public Article putArticle(@PathVariable("id") Integer id, @RequestBody Article article) {
        return articleService.putArticle(id, article);
    }
}
