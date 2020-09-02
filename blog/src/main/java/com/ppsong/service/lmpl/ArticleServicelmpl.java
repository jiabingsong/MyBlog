package com.ppsong.service.lmpl;

import com.ppsong.domain.ArticleTag;
import com.ppsong.domain.Tag;
import com.ppsong.mapper.ArticleMapper;
import com.ppsong.service.ArticleSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 16:07 2020/6/19
 * @Modified By:
 */
@Service
public class ArticleServicelmpl implements ArticleSerice {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public ArticleTag getArticleTagById(Integer id) {
        return articleMapper.getArticleTagById(id);
    }

    @Override
    public List<ArticleTag> getArticleTagList() {
        return articleMapper.getArticleTagList();
    }
}
