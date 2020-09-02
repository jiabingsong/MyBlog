package com.ppsong.service;

import com.ppsong.domain.Article;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 22:50 2020/6/18
 * @Modified By:
 */
public interface HomeService {
    public Article getArticleById(Integer id);
    public List<Article> getArticleList();
}
