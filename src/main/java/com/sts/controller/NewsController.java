package com.sts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.model.NewsArticle;
import com.sts.service.NewsService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") 
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public List<NewsArticle> getNews() {
        return newsService.getNews();
    }
}

