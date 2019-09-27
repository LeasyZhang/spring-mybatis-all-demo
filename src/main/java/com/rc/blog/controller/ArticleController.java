package com.rc.blog.controller;

import com.rc.blog.dto.response.ArticleResponse;
import com.rc.blog.dto.response.ResponseFactory;
import com.rc.blog.model.Article;
import com.rc.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAllArticles() {
        return Collections.emptyList();
    }

    @GetMapping("/article/show/{articleId}")
    public Article findArticleByID(@PathVariable(value = "articleId") String articleId) {
        long id = Long.valueOf(articleId);
        return articleService.findUserRequiredArticle(id);
    }

    @PostMapping("/article/update")
    public ResponseEntity<ArticleResponse> updateArticle(@RequestBody Article article) {
        return ResponseFactory.articleUpdateSuccessResponse();
    }

    @PostMapping("/article/new")
    public Article createArticle(@RequestBody Article article) {
        return new Article();
    }
}
