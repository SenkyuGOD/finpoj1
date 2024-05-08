package edu.training.web.newsproject.beans;

import java.io.Serializable;
import java.util.Objects;

public class News implements Serializable {
    private static final long serialVersionUID = 1L;

    private int newsId;
    private String newsTitle;
    private String newsContent;
    private String newsImg;

    public News() {
    }

    public News(int newsId, String newsTitle, String newsContent, String newsImg) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsImg = newsImg;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return newsId == news.newsId && Objects.equals(newsTitle, news.newsTitle) && Objects.equals(newsContent, news.newsContent) && Objects.equals(newsImg, news.newsImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, newsTitle, newsContent, newsImg);
    }

    @Override
    public String toString() {
        return "News{" + "newsContent='" + newsContent + '\'' + ", newsId=" + newsId + ", newsTitle='" + newsTitle + '\'' + ", newsImg='" + newsImg + '\'' + '}';
    }
}
