package com.ppsong.domain;

import java.util.Date;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 22:03 2020/6/18
 * @Modified By:
 */
public class Article {
    private Long id;
    private String title;
    private String cover;
    private String author;
    private String content;
    private String content_md;
    private String category;
    private String state;
    private Date publish_time;
    private Date edit_time;
    private Date create_time;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_md() {
        return content_md;
    }

    public void setContent_md(String content_md) {
        this.content_md = content_md;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Date getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(Date edit_time) {
        this.edit_time = edit_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

//    public int getTags() {
//        return tags;
//    }
//
//    public void setTags(int tags) {
//        this.tags = tags;
//    }
}
