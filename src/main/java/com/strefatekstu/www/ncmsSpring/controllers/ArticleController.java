package com.strefatekstu.www.ncmsSpring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "/article/{id}")
    public Optional<Article> getOneArticle(@PathVariable("id") Integer id) {
        return articleRepository.findById(id);
    }

    @PostMapping("/article")
    public List<Article> createArticle(Article article) {
        articleRepository.save(article);
        return articleRepository.findAll();
    }

    @DeleteMapping(value = "/article/{id}")
    public List<Article> deleteArticle(@PathVariable("id") Integer id) {
        articleRepository.deleteById(id);
        return articleRepository.findAll();
    }

    @PutMapping(value = "/article/{id}")
    public Article putArticle(@PathVariable("id") Integer id, @RequestBody Article article) {
        articleRepository.findById(id);
        return articleRepository.save(article);
    }
}
