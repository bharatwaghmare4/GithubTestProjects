package com.evalueserve.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.evalueserve.cms.beans.Controls;
import com.evalueserve.cms.beans.Page;

public interface PageMapper {

	public List<Page> getAllPageDetails();
	public Page getPageById(int id);
	public void addPage(Page control) ;
	public void deletePage(int controlId);
	    
}
