package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentImpl implements StudentDao {
	
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query ="insert into student(sId, sName, sCity) values(?, ?, ?)";
		int rowUpdated = this.jdbcTemplate.update(query, student.getsId(), student.getsName(), student.getsCity());
		return rowUpdated;
	}
	
	@Override
	public int update(Student student) {
		String query = "update student set sName=?, sCity=? where sId=?";
		int result = this.jdbcTemplate.update(query, student.getsName(), student.getsCity(), student.getsId());
		return result;
	}
	
	@Override
	public int delete(Student student) {
		String query = "delete from student where sId=?";
		int result = this.jdbcTemplate.update(query, student.getsId());
		return result;
	}
	
	@Override
	public Student getStudent(String studentId) {
		String query = "select * from student where sId=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
