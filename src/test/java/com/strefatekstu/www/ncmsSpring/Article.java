package com.strefatekstu.www.ncmsSpring;

import org.springframework.data.annotation.Id;

public class Article {
    @Id
    public String id;
    public String title;
    public String author;
    public String content;
    public String subtitle;
    public String dateOfAdding;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDateOfAdding() {
        return dateOfAdding;
    }

    public void setDateOfAdding(String dateOfAdding) {
        this.dateOfAdding = dateOfAdding;
    }

    public Article(String title, String author, String content, String subtitle, String dateOfAdding) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.subtitle = subtitle;
        this.dateOfAdding = dateOfAdding;
    }

    @Override
    public String toString() {
        return String.format("Article[id=%s, title='%s', author='%', content='%', subtitle='%', dateOfAdding='%']", id,
                title, author, content, subtitle, dateOfAdding);
    }

}
