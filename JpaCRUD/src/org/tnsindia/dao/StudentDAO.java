package org.tnsindia.dao;

import org.tnsindia.entiities.Student;

public interface StudentDAO {
	//abstract method for CRUD 
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
	Student getStudentByID(int RollNo);

	void beginTransaction();
	void commitTransaction();



}
