package com.evalueserve.cms.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.beans.Page;
import com.evalueserve.cms.service.ControlsService;
import com.evalueserve.cms.service.PageService;
import com.evalueserve.cms.serviceImpl.ControlsServiceImpl;
import com.evalueserve.cms.serviceImpl.PageServiceImpl;

public class PageServiceTest {
	
	private final static Logger logger = LoggerFactory.getLogger(PageServiceTest.class);
	private static PageService pageService;

	@BeforeClass
	public static void setUp() {
		logger.debug("Test setup [start]");
		pageService = new PageServiceImpl();
		logger.debug("Test setup [end]");
	}

	@AfterClass
	public static void tearDown() {
		logger.debug("Test tearDown [start]");
		pageService = null;
		logger.debug("Test tearDown [end]");
	}

	@Test
	public void testGetAllPageDetails() {
		logger.debug("testGetAllPageDetails [start]");
		List<Page> pageList = pageService.getAllPageDetails();
		Assert.assertNotNull(pageList);
		for (Page page : pageList) {
			System.out.println("==============================================");
			System.out.println("Page ID : " + page.getPageID());
			System.out.println("Page Name : " + page.getPageName());
			System.out.println("IS Active : " + page.getIsActive());
			System.out.println("Page Updated BY : " + page.getUpdatedBy());
			System.out.println("Page Created BY : " + page.getCreatedBy());
		}
		logger.debug("testGetAllPageDetails [end]");
	}

	@Test
	public void testGetPageById() {
		logger.debug("testGetControlById [start]");
		Page page = pageService.getPageById(1);
		Assert.assertNotNull(page);
		System.out.println("Page ID : " + page.getPageID());
		System.out.println("Page Name : " + page.getPageName());
		System.out.println("IS Active : " + page.getIsActive());
		System.out.println("Page Updated BY : " + page.getUpdatedBy());
		System.out.println("Page Created BY : " + page.getCreatedBy());
		logger.debug("testGetPageById [end]");
	}

}
