package com.evalueserve.cms.beans;

import java.util.Date;
import java.util.List;

public class PageControlsMapping {

	private int pageControlId;
	/*private int pageId;
	private int controlId;*/
	private String fieldId;
	private byte isReadOnly;
	private String fieldValue;
	private byte isCompulsory;
	private int sequenceId;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updateOn;
	private List<Controls> controls;
	private List<Page> pages;
	private FieldValidationMapping fieldValidationMapping; 

	public PageControlsMapping() {

	}

	public int getPageControlId() {
		return pageControlId;
	}

	public void setPageControlId(int pageControlId) {
		this.pageControlId = pageControlId;
	}

	/*public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public int getControlId() {
		return controlId;
	}

	public void setControlId(int controlId) {
		this.controlId = controlId;
	}*/

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public byte getIsReadOnly() {
		return isReadOnly;
	}

	public void setIsReadOnly(byte isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public byte getIsCompulsory() {
		return isCompulsory;
	}

	public void setIsCompulsory(byte isCompulsory) {
		this.isCompulsory = isCompulsory;
	}

	public int getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	
	public List<Controls> getControls() {
		return controls;
	}

	public void setControls(List<Controls> controls) {
		this.controls = controls;
	}
	
	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	public FieldValidationMapping getFieldValidationMapping() {
		return fieldValidationMapping;
	}

	public void setFieldValidationMapping(FieldValidationMapping fieldValidationMapping) {
		this.fieldValidationMapping = fieldValidationMapping;
	}

}
