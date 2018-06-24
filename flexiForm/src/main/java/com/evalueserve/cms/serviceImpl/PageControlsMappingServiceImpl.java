package com.evalueserve.cms.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.beans.PageControlsMapping;
import com.evalueserve.cms.mapper.ControlsMapper;
import com.evalueserve.cms.mapper.PageControlsMappingMapper;
import com.evalueserve.cms.service.PageControlMappingService;
import com.evalueserve.cms.util.MyBatisSqlSessionFactory;

public class PageControlsMappingServiceImpl implements PageControlMappingService {
	private static final Logger logger = LoggerFactory.getLogger(PageControlsMappingServiceImpl.class);

	@Override
	public List<PageControlsMapping> getPageControlMapping() {
		logger.debug("PageControlsMappingServiceImpl.getPageControlMapping [start]");
		SqlSession sqlSession = null;
		PageControlsMappingMapper pageControlsMappingMapper = null;
		List<PageControlsMapping> pageControlMapList = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageControlsMappingMapper = sqlSession.getMapper(PageControlsMappingMapper.class);
			pageControlMapList = pageControlsMappingMapper.getPageControlMapping();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sqlSession != null) {
					sqlSession.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.debug("PageControlsMappingServiceImpl.getPageControlMapping [end]");
		return pageControlMapList;
	}

	@Override
	public PageControlsMapping getPageControlMappingById(int pageControlID) {
		logger.debug("PageControlsMappingServiceImpl.getPageControlMappingById [start]",pageControlID);
		PageControlsMapping pageControlsMapping = null;
		SqlSession sqlSession = null;
		PageControlsMappingMapper pageControlsMappingMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			pageControlsMappingMapper = sqlSession.getMapper(PageControlsMappingMapper.class);
			pageControlsMapping = pageControlsMappingMapper.getPageControlMappingById(pageControlID);
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
		logger.debug("PageControlsMappingServiceImpl.getPageControlMappingById [end]");
		return pageControlsMapping;
	}
}
