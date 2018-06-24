package com.evalueserve.cms.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.service.ControlsService;
import com.evalueserve.cms.serviceImpl.ControlsServiceImpl;

public class ControlsServiceTest {
	
	private final static Logger logger = LoggerFactory.getLogger(ControlsServiceTest.class);
	private static ControlsService controlService;

	@BeforeClass
	public static void setUp() {
		logger.debug("Test setup [start]");
		controlService = new ControlsServiceImpl();
		logger.debug("Test setup [end]");
	}

	@AfterClass
	public static void tearDown() {
		logger.debug("Test tearDown [start]");
		controlService = null;
		logger.debug("Test tearDown [end]");
	}

	@Test
	public void testGetAllControls() {
		logger.debug("testGetAllControls [start]");
		List<Controls> controlsList = controlService.getAllControls();
		Assert.assertNotNull(controlsList);
		for (Controls controls : controlsList) {
			System.out.println("==============================================");
			System.out.println("Control ID : " + controls.getControlId());
			System.out.println("Control Name : " + controls.getControlName());
			System.out.println("Control Type : " + controls.getControlType());
			System.out.println("Control Updated BY : " + controls.getUpdatedBy());
			System.out.println("Control Created BY : " + controls.getCreatedBy());
		}
		logger.debug("testGetAllControls [end]");
	}

	@Test
	public void testGetControlById() {
		logger.debug("testGetControlById [start]");
		Controls control = controlService.getControlById(4);
		Assert.assertNotNull(control);
		System.out.println("Control ID : " + control.getControlId());
		System.out.println("Control Name : " + control.getControlName());
		System.out.println("Control Type : " + control.getControlType());
		System.out.println("Control Updated BY : " + control.getUpdatedBy());
		System.out.println("Control Created BY : " + control.getCreatedBy());
		logger.debug("testGetControlById [end]");
	}

}
