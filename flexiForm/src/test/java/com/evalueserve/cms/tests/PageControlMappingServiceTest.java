package com.evalueserve.cms.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.beans.FieldValidationMapping;
import com.evalueserve.cms.beans.Page;
import com.evalueserve.cms.beans.PageControlsMapping;
import com.evalueserve.cms.service.PageControlMappingService;
import com.evalueserve.cms.serviceImpl.PageControlsMappingServiceImpl;

public class PageControlMappingServiceTest {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(PageControlMappingServiceTest.class);
	private static PageControlMappingService pageControlMappingService;

	@BeforeClass
	public static void setUp() {
		LOGGER.debug("Test setup method [start]");
		pageControlMappingService = new PageControlsMappingServiceImpl();
		LOGGER.debug("Test setup [end]");
	}

	@AfterClass
	public static void tearDown() {
		LOGGER.debug("Test tearDown [start]");
		pageControlMappingService = null;
		LOGGER.debug("Test tearDown [end]");
	}

	@Test
	public void testGetAllPageControlMappingDetails() {
		LOGGER.debug("testGetAllPageControlMappingDetails [start]");
		List<PageControlsMapping> pageControlList = pageControlMappingService.getPageControlMapping();
		Assert.assertNotNull(pageControlList);
		for (PageControlsMapping pagecontrol : pageControlList) {
			System.out.println("======================New Mapping========================");
			System.out.println("pageControlId: " + pagecontrol.getPageControlId());
			/*System.out.println("pageId: " + pagecontrol.getPageId());
			System.out.println("controlId: " + pagecontrol.getControlId());*/
			System.out.println("fieldId: " + pagecontrol.getFieldId());
			System.out.println("isReadOnly: " + pagecontrol.getIsReadOnly());
			System.out.println("fieldValue: " + pagecontrol.getFieldValue());
			System.out.println("isCompulsory: " + pagecontrol.getIsCompulsory());
			System.out.println("sequenceId: " + pagecontrol.getSequenceId());
			System.out.println("createdBy: " + pagecontrol.getCreatedBy());
			System.out.println("createdOn: " + pagecontrol.getCreatedOn());
			System.out.println("updatedBy: " + pagecontrol.getUpdatedBy());
			System.out.println("updateOn: " + pagecontrol.getUpdateOn());
			List<Page> pageList   = pagecontrol.getPages();
			for(Page page : pageList) {
				System.out.println("====================Page Data==========================");
				System.out.println("Page ID : " + page.getPageID());
				System.out.println("Page Name : " + page.getPageName());
				System.out.println("IS Active : " + page.getIsActive());
				System.out.println("Page Updated BY : " + page.getUpdatedBy());
				System.out.println("Page Created BY : " + page.getCreatedBy());
			}
			List<Controls> controlsList= pagecontrol.getControls();
			for(Controls controls : controlsList) {
				System.out.println("==================Control Data============================");
				System.out.println("Control ID : " + controls.getControlId());
				System.out.println("Control Name : " + controls.getControlName());
				System.out.println("Control Type : " + controls.getControlType());
				System.out.println("Control Updated BY : " + controls.getUpdatedBy());
				System.out.println("Control Created BY : " + controls.getCreatedBy());
			}
			FieldValidationMapping fieldValidationMapping =  pagecontrol.getFieldValidationMapping();
			System.out.println("==================fieldValidationMapping Data============================");
			System.out.println("Validation ID : " + fieldValidationMapping.getValidationId());
			System.out.println("CRequired : " + fieldValidationMapping.getRequired());
			System.out.println("MinLength : " + fieldValidationMapping.getMinLength());
			System.out.println("MaxLength : " + fieldValidationMapping.getMaxLength());
			System.out.println("Email: " + fieldValidationMapping.getEmail());
			System.out.println("Pattern: " + fieldValidationMapping.getPattern());
		}
		LOGGER.debug("testGetAllPageControlMappingDetails [end]");
	}

	/*@Test
	public void testGetAllPageControlMappingDetailsByID() {
		LOGGER.debug("testGetAllPageControlMappingDetailsByID [start]");
		PageControlsMapping pageControlMapping = pageControlMappingService.getPageControlMappingById(1);
		Assert.assertNotNull(pageControlMapping);
		System.out.println("pageControlId: " + pageControlMapping.getPageControlId());
		System.out.println("pageId: " + pageControlMapping.getPageId());
		System.out.println("controlId: " + pageControlMapping.getControlId());
		System.out.println("fieldId: " + pageControlMapping.getFieldId());
		System.out.println("isReadOnly: " + pageControlMapping.getIsReadOnly());
		System.out.println("fieldValue: " + pageControlMapping.getFieldValue());
		System.out.println("isCompulsory: " + pageControlMapping.getIsCompulsory());
		System.out.println("sequenceId: " + pageControlMapping.getSequenceId());
		System.out.println("createdBy: " + pageControlMapping.getCreatedBy());
		System.out.println("createdOn: " + pageControlMapping.getCreatedOn());
		System.out.println("updatedBy: " + pageControlMapping.getUpdatedBy());
		System.out.println("updateOn: " + pageControlMapping.getUpdateOn());
		LOGGER.debug("testGetAllPageControlMappingDetailsByID [end]");
	}*/

}
