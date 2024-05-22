package edu.training.web.newsproject.dao.impl;

import edu.training.web.newsproject.beans.News;
import edu.training.web.newsproject.dao.DaoException;
import edu.training.web.newsproject.dao.NewsDao;

import java.util.List;

public class SQLNewsDao implements NewsDao {
    @Override
    public News createNews(News news) throws DaoException {
        return null;
    }

    @Override
    public News updateNews(News news) throws DaoException {
        return null;
    }

    @Override
    public void deleteNews(Long id) throws DaoException {

    }

    @Override
    public News getNewsById(Long id) throws DaoException {
        return null;
    }

    @Override
    public List<News> getAllNews() throws DaoException {
        return List.of();
    }
}
