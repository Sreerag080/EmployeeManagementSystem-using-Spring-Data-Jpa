package com.Springbootproject.EmployeeManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return repository.findById(id);
	}

	public Employee updateEmployee(int id, Employee employee) {

		Employee existingEmployee = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));

		existingEmployee.setName(employee.getName());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setDepartment(employee.getDepartment());

		return repository.save(existingEmployee);
	}

	public void deleteEmployee(int id) {

		if (!repository.existsById(id)) {
			throw new RuntimeException("Employee not found");
		}

		repository.deleteById(id);
	}

}
