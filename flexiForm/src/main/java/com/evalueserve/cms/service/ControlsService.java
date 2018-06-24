package com.evalueserve.cms.service;

import java.util.List;

import com.evalueserve.cms.beans.Controls;

public interface ControlsService {
	
	public List<Controls> getAllControls();
	public Controls getControlById(int id);
	public void addControl(Controls control) ;
	public void deleteControl(int controlId);

}
