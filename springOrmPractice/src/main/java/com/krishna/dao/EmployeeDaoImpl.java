package com.krishna.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.krishna.model.Employee;

import jakarta.transaction.Transactional;

public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate hibeTemplate;
	
	
	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibeTemplate() {
		return hibeTemplate;
	}

	public void setHibeTemplate(HibernateTemplate hibeTemplate) {
		this.hibeTemplate = hibeTemplate;
	}

@Transactional
	public int insert(Employee employee) {
		Integer i = (Integer) hibeTemplate.save(employee);
		return i;
	}

}
