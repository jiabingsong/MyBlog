package com.ppsong.service;

import com.ppsong.domain.Article;
import com.ppsong.domain.ArticleTag;
import com.ppsong.domain.Tag;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 17:33 2020/6/19
 * @Modified By:
 */
public interface ArticleSerice {
    public ArticleTag getArticleTagById(Integer id);
    public List<ArticleTag> getArticleTagList();
}
