package com.evalueserve.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.evalueserve.cms.beans.Controls;

public interface ControlsMapper {

	public List<Controls> getAllControls();
	public Controls getControlById(Integer id);
	public void addControl(Controls control) ;
	public void deleteControl(int controlId);
	    
}
