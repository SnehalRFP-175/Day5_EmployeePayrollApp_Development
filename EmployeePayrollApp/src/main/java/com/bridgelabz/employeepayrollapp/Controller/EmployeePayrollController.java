package com.bridgelabz.employeepayrollapp.Controller;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/empData")

public class EmployeePayrollController {

        @PostMapping("/Data")
        public String employeeData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
            return "Name :"+ employeePayrollDTO.name + " Salary :" +employeePayrollDTO.salary;
        }
    }


