package com.cognizant.project.app.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.project.app.dao.DepartmentDao;
import com.cognizant.project.app.model.Department;
@Service
public class DepartmentService {
DepartmentDao deptdao=new DepartmentDao();
	
	public ArrayList<Department> getAllDepartments(){
		return deptdao.getAllDepartments();
	}

}
