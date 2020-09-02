package com.ppsong.mapper;

import com.ppsong.domain.Article;
import com.ppsong.domain.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 15:26 2020/6/19
 * @Modified By:
 */
@Mapper
public interface TagMapper {
    @Select("SELECT * FROM tb_tag")
    public List<Tag> getTagList();
    @Select("SELECT * FROM tb_tag WHERE id = #{id}")
    public Tag getTagById(Integer id);
}
