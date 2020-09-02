package com.ppsong.controller;

import com.ppsong.domain.Article;
import com.ppsong.domain.ArticleTag;
import com.ppsong.domain.Tag;
import com.ppsong.service.ArticleSerice;
import com.ppsong.service.HomeService;
import com.ppsong.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 18:45 2020/6/18
 * @Modified By:
 */
@Controller
public class Group09Controller {
    @Autowired
    private HomeService homeService;
    @Autowired
    private TagService tagService;
    @Autowired
    private ArticleSerice articleSerice;
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "PPSONG") String name) {
        request.setAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/")
    public String home(HttpServletRequest request, @RequestParam(value = "homelist",required = false) List<Article> homeList) {
//        List<Article> homelist = homeService.getArticleList();
        homeList = homeService.getArticleList();
        List<Tag> tags = tagService.getTagList();
        System.out.println(homeList.get(0).getPublish_time());
        request.setAttribute("taglist",tags);
        request.setAttribute("homelist",homeList);
        return "index";
    }
    @RequestMapping("/about")
    public String about(HttpServletRequest request, @RequestParam(value = "homelist", defaultValue = "PPSONG") String name) {
        request.setAttribute("name", name);
        List<Tag> tags = tagService.getTagList();
        request.setAttribute("taglist",tags);
        return "about/index";
    }
    @RequestMapping("/archives")
    public String archives(HttpServletRequest request, @RequestParam(value = "homelist",required = false) List<Article> homeList) {
        homeList = homeService.getArticleList();

        request.setAttribute("homelist", homeList);
        return "archives/index";
    }

    @RequestMapping("/tags")
    public String tags(HttpServletRequest request, @RequestParam(value = "taglist", required = false) List<Tag> tagList,
                       @RequestParam(value = "articletag",required = false)List<ArticleTag> articleTagList,
                       @RequestParam(value = "homelist",required = false) List<Article> homeList) {
        articleTagList = articleSerice.getArticleTagList();
        homeList = homeService.getArticleList();
        tagList = tagService.getTagList();
        request.setAttribute("taglist", tagList);
        request.setAttribute("articleTaglist",articleTagList);
        request.setAttribute("homelist",homeList);
        System.out.println(String.valueOf(articleTagList.get(0).getId()));
        return "tags/index";
    }
    @RequestMapping("/music")
    public String music(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "PPSONG") String name) {
        request.setAttribute("name", name);
        List<Tag> tags = tagService.getTagList();
        request.setAttribute("taglist",tags);
        return "music/index";
    }

    @RequestMapping(value = "/page/{id}" ,method = RequestMethod.GET)
    public String page(HttpServletRequest request, @PathVariable(value = "id") Integer id) {
        Article article = homeService.getArticleById(id);
        System.out.println(article.getType());
        Tag tag = tagService.getTagById(article.getType());
        System.out.println(tag.getName());
        int minid = Math.toIntExact(homeService.getArticleList().get(0).getId());
        int maxid = Math.toIntExact(homeService.getArticleList().get(homeService.getArticleList().size()-1).getId());
        System.out.println(maxid);
        request.setAttribute("article",article);
        request.setAttribute("tag",tag);
        request.setAttribute("maxid",maxid);
        request.setAttribute("minid",minid);
//        request.setAttribute("id", id);
//        request.setAttribute("name", name);
        return "page/index";
    }
}
