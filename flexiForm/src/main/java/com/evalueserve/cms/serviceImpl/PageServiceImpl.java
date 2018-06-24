package com.evalueserve.cms.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evalueserve.cms.beans.Page;
import com.evalueserve.cms.mapper.PageMapper;
import com.evalueserve.cms.service.PageService;
import com.evalueserve.cms.util.MyBatisSqlSessionFactory;

public class PageServiceImpl implements PageService {
	private final static Logger logger = LoggerFactory.getLogger(PageServiceImpl.class);
	@Override
	public List<Page> getAllPageDetails() {
		logger.debug("PageServiceImpl.getAllPageDetails [start]");
		SqlSession sqlSession = null;
		PageMapper pageMapper = null;
		List<Page> pageList = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageMapper = sqlSession.getMapper(PageMapper.class);
			pageList = pageMapper.getAllPageDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (sqlSession != null) {
					sqlSession.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.debug("PageServiceImpl.getAllPageDetails [end]");
		return pageList;
	}

	@Override
	public Page getPageById(int id) {
		logger.debug("PageServiceImpl.getPageById [start]", id);
		SqlSession sqlSession = null;
		PageMapper pageMapper = null;
		Page page = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageMapper = sqlSession.getMapper(PageMapper.class);
			page = pageMapper.getPageById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (sqlSession != null) {
					sqlSession.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.debug("PageServiceImpl.getPageById [end]");
		return page;
	}

	@Override
	public void addPage(Page page) {
		logger.debug("PageServiceImpl.addPage [start]");
		SqlSession sqlSession = null;
		PageMapper pageMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageMapper = sqlSession.getMapper(PageMapper.class);
			pageMapper.addPage(page);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (sqlSession != null) {
					sqlSession.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.debug("PageServiceImpl.addPage [end]");
	}

	@Override
	public void deletePage(int pageId) {
		logger.debug("PageServiceImpl.deletePage [start]",pageId);
		SqlSession sqlSession = null;
		PageMapper pageMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageMapper = sqlSession.getMapper(PageMapper.class);
			pageMapper.deletePage(pageId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (sqlSession != null) {
					sqlSession.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.debug("PageServiceImpl.deletePage [end]");
	}

}
