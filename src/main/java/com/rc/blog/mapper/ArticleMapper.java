package com.rc.blog.mapper;

import com.rc.blog.model.Article;

public interface ArticleMapper {

    Article selectArticleById(long articleId);
}
