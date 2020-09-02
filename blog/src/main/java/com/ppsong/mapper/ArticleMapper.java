package com.ppsong.mapper;

import com.ppsong.domain.Article;
import com.ppsong.domain.ArticleTag;
import com.ppsong.domain.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 15:58 2020/6/19
 * @Modified By:
 */
@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM tb_article_tag")
    public List<ArticleTag> getArticleTagList();
    @Select("SELECT * FROM tb_article_tag WHERE id = #{id}")
    public ArticleTag getArticleTagById(Integer id);
}
