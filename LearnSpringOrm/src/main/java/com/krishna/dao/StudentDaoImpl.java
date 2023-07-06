package com.krishna.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.krishna.model.Student;

import jakarta.transaction.Transactional;

public class StudentDaoImpl implements StudentDao{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

@Transactional
	public int insert(Student student) {
		Integer i = (Integer) hibernateTemplate.save(student);
		return i;
	}

}
