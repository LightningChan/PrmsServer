package com.ucas.prms.server.service;

import java.util.List;

import com.ucas.prms.server.entity.Reply;

public interface ReplyService {

	public void save(Reply reply);
	
	public List<Reply> getAllByArticleId(Long id);
	
}
