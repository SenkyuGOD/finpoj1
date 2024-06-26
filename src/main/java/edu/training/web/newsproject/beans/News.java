package edu.training.web.newsproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer newsId;
    private String newsTitle;
    private String newsContent;
    private String newsImg;
    private String author;
    private LocalDateTime publishedDate;
    private String category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(newsId, news.newsId) &&
                Objects.equals(newsTitle, news.newsTitle) &&
                Objects.equals(newsContent, news.newsContent) &&
                Objects.equals(newsImg, news.newsImg) &&
                Objects.equals(author, news.author) &&
                Objects.equals(publishedDate, news.publishedDate) &&
                Objects.equals(category, news.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, newsTitle, newsContent, newsImg, author, publishedDate, category);
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsImg='" + newsImg + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate=" + publishedDate +
                ", category='" + category + '\'' +
                '}';
    }
}

