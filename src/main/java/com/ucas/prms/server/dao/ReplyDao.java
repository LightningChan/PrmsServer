package com.ucas.prms.server.dao;

import java.util.List;

import com.ucas.prms.server.entity.Reply;

public interface ReplyDao extends BaseDao<Reply> {

	public List<Reply> getAllByArticleId(Long id);
}
