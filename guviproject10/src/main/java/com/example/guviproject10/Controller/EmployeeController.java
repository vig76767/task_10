package com.example.guviproject10.Controller;

import com.example.guviproject10.Modal.Employee;
import com.example.guviproject10.Repository.EmployeeRespository;
import com.example.guviproject10.Service.Serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class EmployeeController {
    @Autowired
    private Serviceimpl serviceimpl;
    @GetMapping("/Employee")
    public String shoepage(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/Employee")

        public String submitdata(@ModelAttribute Employee employee,Model model){
        serviceimpl.adddata(employee);
        model.addAttribute("message", "User registered successfully!");
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @GetMapping("/display")
    public String display(Model modal){
        List<Employee> dispalyAll =serviceimpl.displayall();
        modal.addAttribute("displayall",dispalyAll);
        return "display";
    }

    @GetMapping({"{id}"})
    public String dispalyEmployee(@PathVariable("id") Integer id,Model model){
        Employee employee = serviceimpl.display(id);
        model.addAttribute("employee", employee);
        return "dis";
    }




}
