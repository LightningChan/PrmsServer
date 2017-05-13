package com.ucas.prms.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.ucas.prms.server.dao.ArticleDao;
import com.ucas.prms.server.entity.Article;

@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

}
