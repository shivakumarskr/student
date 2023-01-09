package com.student.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.student.Entity.student;

public interface StudentRepository extends CrudRepository<student,Integer>{

	@Query("select u from student u where u.StudentID =:n")
	public student getStudentById(@Param("n")int id);
	
	@Query("select u from student u where u.StudentName =:n")
	public student getStudentByName(@Param("n")String name);
}
