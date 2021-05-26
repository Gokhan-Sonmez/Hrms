package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.EmployerUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/employerusers")
public class EmployerUsersController {
	
	private EmployerUserService employerUserService;

	@Autowired
	public EmployerUsersController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}
	
	@GetMapping("/getall")
	DataResult<List<EmployerUser>> getAll(){
		
		return this.employerUserService.getAll();
	}
	
	@PostMapping("/add")
	Result add(@RequestBody EmployerUser employerUser) {
		return this.employerUserService.add(employerUser);
		
	}

}
