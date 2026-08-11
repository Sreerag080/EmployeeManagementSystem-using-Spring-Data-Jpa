package com.Springbootproject.EmployeeManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {

		return service.updateEmployee(id, employee);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {

		service.deleteEmployee(id);

		return "Employee deleted successfully";
	}

}
