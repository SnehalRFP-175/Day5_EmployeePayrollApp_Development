package com.bridgelabz.employeepayrollapp.Controller;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.DTO.ResponseDTO;
import com.bridgelabz.employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/*
* UC1-Introducing DTO and Model to Employee Payroll App
* */

@RestController
@RequestMapping("/empData")
public class EmployeePayrollController {
    @RequestMapping("/Data")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData()
    {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Snehal", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", empData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }


    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Snehal", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Data ", empPayrollDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }


    @PutMapping(path = "/update/{empId}", consumes = {"application/json"})
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,
                                                                 @RequestBody EmployeePayrollDTO empPayrollDTO)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee payroll Data for: ", empPayrollDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
        ResponseDTO respDTO = new ResponseDTO("Deleted Employee Data ", empId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }



}


