package com.strefatekstu.www.ncmsSpring.services;

import com.strefatekstu.www.ncmsSpring.entites.Article;
import com.strefatekstu.www.ncmsSpring.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> createArticle(Article article) {
        articleRepository.save(article);
        return articleRepository.findAll();
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Optional<Article> getOneArticle(Integer id) {
        return articleRepository.findById(id);
    }

    public List<Article> deleteArticle(Integer id) {
        articleRepository.deleteById(id);
        return articleRepository.findAll();
    }

    public Article putArticle(Integer id, Article article) {
        articleRepository.findById(id);
        return articleRepository.save(article);
    }
}
