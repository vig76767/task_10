package com.example.guviproject10.Repository;

import com.example.guviproject10.Modal.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRespository extends MongoRepository<Employee,String> {
}
