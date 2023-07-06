package com.krishna.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.krishna.model.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int addStudent() {
	
	String query="insert into mystudent values(?,?,?,?)";
	Student stud=new Student(1, "gautam", "cipet12", "vaishali");
	int update = template.update(query,stud);
		return update;
	}

}
