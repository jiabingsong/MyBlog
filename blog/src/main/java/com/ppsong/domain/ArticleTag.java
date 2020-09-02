package com.ppsong.domain;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 15:45 2020/6/19
 * @Modified By:
 */
public class ArticleTag {
    private int id;
    private int article_id;
    private int tag_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }
}
