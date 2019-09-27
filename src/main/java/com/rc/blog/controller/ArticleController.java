package com.rc.blog.controller;

import com.rc.blog.dto.response.ArticleResponse;
import com.rc.blog.dto.response.ResponseFactory;
import com.rc.blog.model.Article;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ArticleController {

    @GetMapping("/articles")
    public List<Article> getAllArticles() {
        return Collections.emptyList();
    }

    @GetMapping("/article/show/{articleID}")
    public Article findArticleByID(@PathVariable(value = "articleID") String articleID) {
        return new Article();
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
