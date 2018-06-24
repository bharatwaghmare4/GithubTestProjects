package com.evalueserve.cms.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.mapper.ControlsMapper;
import com.evalueserve.cms.service.ControlsService;
import com.evalueserve.cms.util.MyBatisSqlSessionFactory;

public class ControlsServiceImpl implements ControlsService {
	private static final Logger logger = LoggerFactory.getLogger(ControlsServiceImpl.class);
	@Override
	public List<Controls> getAllControls() {
		logger.debug("ControlsServiceImpl.getAllControls [start]");
		SqlSession sqlSession = null;
		ControlsMapper controlsMapper = null;
		List<Controls> controlsList = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			controlsMapper = sqlSession.getMapper(ControlsMapper.class);
			controlsList = controlsMapper.getAllControls();
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
		logger.debug("ControlsServiceImpl.getAllControls [end]");
		return controlsList;
	}

	@Override
	public Controls getControlById(int controlId) {
		logger.debug("ControlsServiceImpl.getControlById [start]",controlId);
		Controls control = null;
		SqlSession sqlSession = null;
		ControlsMapper controlsMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			controlsMapper = sqlSession.getMapper(ControlsMapper.class);
			control = controlsMapper.getControlById(controlId);
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
		logger.debug("ControlsServiceImpl.getControlById [end]");
		return control;
	}

	@Override
	public void addControl(Controls control) {
		logger.debug("ControlsServiceImpl.addControl [start]");
		SqlSession sqlSession = null;
		ControlsMapper controlsMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			controlsMapper = sqlSession.getMapper(ControlsMapper.class);
			controlsMapper.addControl(control);
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
		logger.debug("ControlsServiceImpl.addControl [end]");
	}

	@Override
	public void deleteControl(int controlId) {
		logger.debug("ControlsServiceImpl.deleteControl [start]",controlId);
		SqlSession sqlSession = null;
		ControlsMapper controlsMapper = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			controlsMapper = sqlSession.getMapper(ControlsMapper.class);
			controlsMapper.deleteControl(controlId);
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
		logger.debug("ControlsServiceImpl.deleteControl [end]");
	}
}
