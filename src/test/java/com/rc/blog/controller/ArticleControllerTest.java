package com.rc.blog.controller;

import com.google.gson.Gson;
import com.rc.blog.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ArticleController.class)
public class ArticleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String APPLICATION_JSON = "application/json";

    @Test
    public void testListAllArticlesShouldSuccess() throws Exception {
        mockMvc.perform(get("/articles").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testFindArticleShouldSuccess() throws Exception {
        mockMvc.perform(get("/article/show/{articleID}", 1).contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdateArticleShouldSuccess() throws Exception {
        mockMvc.perform(post("/article/update")
                .contentType(APPLICATION_JSON)
                .content(new Gson().toJson(new Article())))
                .andExpect(status().isOk());
    }

    @Test
    public void testNewArticleShouldSuccess() throws Exception {
        mockMvc.perform(post("/article/new")
                .contentType(APPLICATION_JSON)
                .content(new Gson().toJson(new Article())))
                .andExpect(status().isOk());
    }
}
