package com.example.demoForJpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demoForJpa.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	
	

}
