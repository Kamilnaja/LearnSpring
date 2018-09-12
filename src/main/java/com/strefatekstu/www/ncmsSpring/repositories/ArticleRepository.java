package com.strefatekstu.www.ncmsSpring.repositories;

import com.strefatekstu.www.ncmsSpring.entites.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
