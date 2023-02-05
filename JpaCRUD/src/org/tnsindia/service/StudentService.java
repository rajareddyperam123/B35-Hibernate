package org.tnsindia.service;

import org.tnsindia.entiities.Student;

public interface StudentService {
	//abstract method for CRUD 
	void create(Student student);
	void update(Student student);
	void delete(Student student);
	Student retrieve(int RollNo);

	


}
