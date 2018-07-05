package com.framgia.action;

import java.util.List;
import java.util.Map;

import com.framgia.model.Category;
import com.framgia.model.News;
import com.framgia.service.CategoryService;
import com.framgia.service.NewsService;
import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private NewsService newsService;
	private List<Category> categories;
	private CategoryService categoryService;
	private Map<String, Object> sessionAttributes;
	private News news;
	List<String> fileUpload;
	private Integer id;

	public String findByNewId() {
		news = newsService.findById(id);
		return SUCCESS;
	}

	public String addNew(News news) {

		return null;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public List<String> getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(List<String> fileUpload) {
		this.fileUpload = fileUpload;
	}
}
