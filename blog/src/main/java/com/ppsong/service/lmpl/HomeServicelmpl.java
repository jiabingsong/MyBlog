package com.ppsong.service.lmpl;

import com.ppsong.domain.Article;
import com.ppsong.mapper.HomeMapper;
import com.ppsong.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 22:53 2020/6/18
 * @Modified By:
 */
@Service
public class HomeServicelmpl implements HomeService {
    @Autowired
    private HomeMapper homeMapper;
    @Override
    public Article getArticleById(Integer id) {
        return homeMapper.getArticleById(id);
    }

    @Override
    public List<Article> getArticleList() {
        return homeMapper.getArticleList();
    }
}
