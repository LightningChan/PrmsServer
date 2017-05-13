package com.ucas.prms.server.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucas.prms.server.dao.ArticleDao;
import com.ucas.prms.server.entity.Article;
import com.ucas.prms.server.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public void save(Article article) {
		articleDao.save(article);
		logger.info("保存一篇文章"+article.getTitle());
	}

	@Override
	public Article getById(Long id) {
		return articleDao.getById(id);
	}

	@Override
	public List<Article> getByIds(Long[] ids) {
		return articleDao.getByIds(ids);
	}

	@Override
	public List<Article> findAll() {
		return articleDao.findAll();
	}

	
}
