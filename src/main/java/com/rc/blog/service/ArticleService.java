package com.rc.blog.service;

import com.rc.blog.mapper.ArticleMapper;
import com.rc.blog.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public Article findUserRequiredArticle(long id) {
        return articleMapper.selectArticleById(id);
    }
}
