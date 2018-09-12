package com.strefatekstu.www.ncmsSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.strefatekstu.www.ncmsSpring.entites.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
