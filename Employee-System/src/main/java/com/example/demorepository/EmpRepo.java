package com.example.demorepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoentity.Employee;

@Repository
public interface  EmpRepo extends JpaRepository<Employee, Long> {
	

}
