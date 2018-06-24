package com.evalueserve.cms.mapper;

import java.util.List;

import com.evalueserve.cms.beans.PageControlsMapping;

public interface PageControlsMappingMapper {

	public List<PageControlsMapping> getPageControlMapping() ;
	public PageControlsMapping getPageControlMappingById(int pageControlID);

}
