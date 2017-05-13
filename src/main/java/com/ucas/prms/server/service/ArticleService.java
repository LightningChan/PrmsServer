package com.ucas.prms.server.service;

import java.util.List;

import com.ucas.prms.server.entity.Article;

public interface ArticleService {

	public void save(Article article);
	
	public Article getById(Long id);
	
	public List<Article> getByIds(Long[] ids);
	
	public List<Article> findAll();
	
}
