package edu.training.web.newsproject.service;

import edu.training.web.newsproject.beans.News;

import java.util.List;

public interface NewsService {
    News createNews(News news) throws ServiceException;
    News updateNews(News news) throws ServiceException;
    void deleteNews(Long id) throws ServiceException;
    News getNewsById(Long id) throws ServiceException;
    List<News> getAllNews() throws ServiceException;
}
