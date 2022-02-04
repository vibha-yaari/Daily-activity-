package com.example.demoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoentity.Employee;
import com.example.demorepository.EmpRepo;

@Service

public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	public List<Employee> listAll(){
		return repo.findAll();
	}
public void save(Employee emp) {
	repo.save(emp);
	
}

public Employee get (long id) {
	return repo.findById(id).get();
}

public void delete(long id ) {
	repo.deleteById(id);
}
}
