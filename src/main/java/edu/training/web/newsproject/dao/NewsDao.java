package edu.training.web.newsproject.dao;

import edu.training.web.newsproject.beans.News;

import java.util.List;

public interface NewsDao {
    News createNews(News news) throws DaoException;

    News updateNews(News news) throws DaoException;

    void deleteNews(Long id) throws DaoException;

    News getNewsById(Long id) throws DaoException;

    List<News> getAllNews() throws DaoException;
}
