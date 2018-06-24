package com.evalueserve.cms.service;

import java.util.List;

import com.evalueserve.cms.beans.PageControlsMapping;

public interface PageControlMappingService {
	public List<PageControlsMapping> getPageControlMapping() ;
	public PageControlsMapping getPageControlMappingById(int pageControlID);
}
