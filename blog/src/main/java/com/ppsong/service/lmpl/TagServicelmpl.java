package com.ppsong.service.lmpl;

import com.ppsong.domain.Tag;
import com.ppsong.mapper.TagMapper;
import com.ppsong.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 15:31 2020/6/19
 * @Modified By:
 */
@Service
public class TagServicelmpl implements TagService {
    @Autowired
    private TagMapper tagMapper;
    @Override
    public Tag getTagById(Integer id) {
        return tagMapper.getTagById(id);
    }

    @Override
    public List<Tag> getTagList() {
        return tagMapper.getTagList();
    }
}
