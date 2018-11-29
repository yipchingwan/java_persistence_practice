package com.tw.apistackbase.repository;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
