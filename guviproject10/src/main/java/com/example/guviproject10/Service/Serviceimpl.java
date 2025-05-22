package com.example.guviproject10.Service;

import com.example.guviproject10.Modal.Employee;
import com.example.guviproject10.Repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
@Service
public class Serviceimpl implements imple {
    @Autowired
    private EmployeeRespository employeeRespository;
    @Override
    public Employee adddata(Employee employee) {
        return employeeRespository.save(employee);
    }

    @Override
    public Employee display(Integer id) {
        List<Employee> employees = employeeRespository.findAll();

        for(Employee obj : employees){
            if(obj.getEmployeeId()==id){
                return obj;
            }
        }
       return null;
    }



    @Override
    public List<Employee> displayall() {
        return employeeRespository.findAll();
    }
}
