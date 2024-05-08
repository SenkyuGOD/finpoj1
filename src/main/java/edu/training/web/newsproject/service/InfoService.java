package edu.training.web.newsproject.service;

import edu.training.web.newsproject.beans.News;

import java.util.List;

public interface InfoService {
    List<News> lastNews();

    List<News> getNews(int id);
}
