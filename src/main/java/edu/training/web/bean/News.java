package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class News implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String content;
    private String author;
    private int id;

    public News() {
    }

    public News(String title, String content, String author, int id) {
        this.content = content;
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id && Objects.equals(title, news.title) && Objects.equals(content, news.content) && Objects.equals(author, news.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, author, id);
    }

    @Override
    public String toString() {
        return "News{" + "author='" + author + '\'' + ", title='" + title + '\'' + ", content='" + content + '\'' + ", id=" + id + '}';
    }
}
