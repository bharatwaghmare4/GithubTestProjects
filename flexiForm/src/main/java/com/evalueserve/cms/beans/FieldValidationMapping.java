package com.evalueserve.cms.beans;

import java.util.Date;

public class FieldValidationMapping {
	
	private int validationId;
	private  int pageControlId;
	private byte required;
	private int minLength;
	private int maxLength;
	private byte email;
	private String pattern;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	private PageControlsMapping pageControlsMapping;
	public FieldValidationMapping() {
		
	}

	public PageControlsMapping getPageControlsMapping() {
		return pageControlsMapping;
	}

	public void setPageControlsMapping(PageControlsMapping pageControlsMapping) {
		this.pageControlsMapping = pageControlsMapping;
	}

	public int getValidationId() {
		return validationId;
	}

	public void setValidationId(int validationId) {
		this.validationId = validationId;
	}

	public int getPageControlId() {
		return pageControlId;
	}

	public void setPageControlId(int pageControlId) {
		this.pageControlId = pageControlId;
	}

	public byte getRequired() {
		return required;
	}

	public void setRequired(byte required) {
		this.required = required;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public byte getEmail() {
		return email;
	}

	public void setEmail(byte email) {
		this.email = email;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
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

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
