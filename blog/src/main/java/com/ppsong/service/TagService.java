package com.ppsong.service;

import com.ppsong.domain.Article;
import com.ppsong.domain.Tag;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 15:28 2020/6/19
 * @Modified By:
 */
public interface TagService {
    public Tag getTagById(Integer id);
    public List<Tag> getTagList();
}
