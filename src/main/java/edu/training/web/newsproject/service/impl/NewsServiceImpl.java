package edu.training.web.newsproject.service.impl;

import edu.training.web.newsproject.beans.News;
import edu.training.web.newsproject.dao.DaoProvider;
import edu.training.web.newsproject.dao.NewsDao;
import edu.training.web.newsproject.service.NewsService;
import edu.training.web.newsproject.service.ServiceException;

import java.util.List;

public class NewsServiceImpl implements NewsService {
    private NewsDao newsDao = DaoProvider.getInstance().getNewsDao();
    @Override
    public News createNews(News news) throws ServiceException {
        return null;
    }

    @Override
    public News updateNews(News news) throws ServiceException {
        return null;
    }

    @Override
    public void deleteNews(Long id) throws ServiceException {

    }

    @Override
    public News getNewsById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<News> getAllNews() throws ServiceException {
        return List.of();
    }
}
