package com.ucas.prms.server.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ucas.prms.server.dao.ReplyDao;
import com.ucas.prms.server.entity.Reply;

@Transactional
@Repository("replyDao")
public class ReplyDaoImpl extends BaseDaoImpl<Reply> implements ReplyDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Reply> getAllByArticleId(Long id) {
		if (id == null) {
			return null;
		} else {
			return getSession().createQuery("FROM Reply Where article_id = (:id)")//
					.setParameter("id", id)//
					.list();
		}
	}

}
