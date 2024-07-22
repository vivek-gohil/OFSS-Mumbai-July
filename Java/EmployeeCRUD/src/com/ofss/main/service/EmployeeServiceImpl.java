package com.ofss.main.service;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.Employee;
import com.ofss.main.repository.EmployeeRepository;
import com.ofss.main.repository.EmployeeRepostioryImpl;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepostioryImpl();
    
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployeeByEmployeeId(int employeeId) {
        return employeeRepository.getEmployeeByEmployeeId(employeeId);
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewEmployee'");
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }

    @Override
    public boolean deleteEmployeeByEmployeeId(int employeeId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployeeByEmployeeId'");
    }

}
