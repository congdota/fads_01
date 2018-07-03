package com.framgia.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.framgia.dao.NewsDAO;
import com.framgia.model.News;
import com.framgia.service.NewsService;

<<<<<<< 514284cb26c19d394885cbc3abe80cedf157f916
public class NewsServiceImpl implements NewsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	private NewsDAO newsDAO;

	@Override
	public List<News> findNewsByCategoryId(Integer category_id, Integer status) {
		LOGGER.info("List news by category");
		return getNewsDAO().findNewsByCategoryId(category_id, status);
	}

	public NewsDAO getNewsDAO() {
		return newsDAO;
	}

=======
public class NewsServiceImpl implements NewsService{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	private NewsDAO newsDAO;
	@Override
	public List<News> findNewsByCategoryId(Integer category_id,Integer status) {
		LOGGER.info("List news by category");
		return getNewsDAO().findNewsByCategoryId(category_id,status);
	}
	public NewsDAO getNewsDAO() {
		return newsDAO;
	}
>>>>>>> Get list News follow Category
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

<<<<<<< 514284cb26c19d394885cbc3abe80cedf157f916
	@Override
	public News findById(Integer id) {
		return getNewsDAO().findBy("id", id);
	}

=======
>>>>>>> Get list News follow Category
}
