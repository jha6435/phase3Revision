package com.krishna.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.krishna.model.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
		
		String query="insert into student (id,name,city) values(?,?,?)";
		int re = template.update(query, student.getId(),student.getName(),student.getCity());
		return re;
	}

	public int change(Student student) {
		String query="update student set name=?, city=? where id=?";
		int up = template.update(query, student.getName(),student.getCity(),student.getId());
		return up;
	}

	public int delete(int id) {
		String query="delete from student where id=?";
		int update = template.update(query, id);
		return update;
	}

	public Student getStudent(int id) {
		String query="select* from student where id=?";
		RowMapper<Student> rowMapper=new RawMapper();
		Student out = template.queryForObject(query, rowMapper,id);
		return out;
	}

	public List<Student> getAllStudent() {
		String data="select* from student";
		RowMapper<Student> rowmap=new RawMapper();
		List<Student> output = template.query(data, rowmap);
		return output;
	}

	public Student getStudent(String name) {
		String query="select* from student where name=?";
		Student queryForObject = template.queryForObject(query, new RawMapper(), name);
		return queryForObject;
	}

}
