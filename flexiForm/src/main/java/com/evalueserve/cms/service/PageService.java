package com.evalueserve.cms.service;

import java.util.List;

import com.evalueserve.cms.beans.Page;

public interface PageService {
	
	public List<Page> getAllPageDetails();
	public Page getPageById(int id);
	public void addPage(Page control) ;
	public void deletePage(int controlId);

}
