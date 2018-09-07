package com.strefatekstu.www.ncmsSpring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {

    public Article findByTitle(String title);

    public List<Article> findBySubtitle(String subtitle);
}
