package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.EmployeeUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.EmployeeUser;

@RestController
@RequestMapping("/api/employeeusers")
public class EmployeeUsersController {
	
	private EmployeeUserService employeeUserService;

	@Autowired
	public EmployeeUsersController(EmployeeUserService employeeUserService) {
		super();
		this.employeeUserService = employeeUserService;
	}
	
	@GetMapping("/getall")
	DataResult<List<EmployeeUser>> getAll(){
		
		return this.employeeUserService.getAll();
	}
	
	@PostMapping("/add")
	Result add(EmployeeUser employeeUser) {
		return this.employeeUserService.add(employeeUser);
		
	}
}
