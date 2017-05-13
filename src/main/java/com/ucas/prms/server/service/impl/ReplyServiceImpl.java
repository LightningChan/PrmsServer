package com.ucas.prms.server.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucas.prms.server.dao.ReplyDao;
import com.ucas.prms.server.entity.Reply;
import com.ucas.prms.server.service.ReplyService;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ReplyDao replyDao;
	
	@Override
	public void save(Reply reply) {
		replyDao.save(reply);
		logger.info("保存一条评论");
	}

	@Override
	public List<Reply> getAllByArticleId(Long id) {
		return replyDao.getAllByArticleId(id);
	}

}
