package com.strefatekstu.www.ncmsSpring.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @GetMapping("/article")
    public String getArticle(Model model) {
        return "article";
    }
}
