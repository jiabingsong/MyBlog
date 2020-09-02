package com.ppsong.mapper;

import com.ppsong.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 22:14 2020/6/18
 * @Modified By:
 */
@Mapper
public interface HomeMapper {
    @Select("SELECT * FROM tb_article")
    public List<Article> getArticleList();
    @Select("SELECT * FROM tb_article WHERE id = #{id}")
    public Article getArticleById(Integer id);
}
