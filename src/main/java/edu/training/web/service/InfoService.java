package edu.training.web.service;

import edu.training.web.bean.News;

import java.util.List;

public interface InfoService {
    List<News> lastNews();
}
