package edu.training.web.newsproject.dao;

import edu.training.web.newsproject.dao.impl.SQLAuthDao;
import edu.training.web.newsproject.dao.impl.SQLCommentDao;
import edu.training.web.newsproject.dao.impl.SQLNewsDao;
import edu.training.web.newsproject.dao.impl.SQLRegDao;
import lombok.Getter;

public class DaoProvider {
    private static final DaoProvider INSTANCE = new DaoProvider();

    @Getter
    private AuthDao authDao = new SQLAuthDao();

    @Getter
    private RegDao regDao = new SQLRegDao();

    @Getter
    private NewsDao newsDao = new SQLNewsDao();

    @Getter
    private CommentDao commentDao = new SQLCommentDao();

    private DaoProvider() {
    }

    public static DaoProvider getInstance() {
        return INSTANCE;
    }
}
