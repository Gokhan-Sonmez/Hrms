package HrmsProject.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.AuthService;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.CandidateUser;
import HrmsProject.Hrms.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmpolyer(@RequestBody EmployerUser employer)
	{
		return authService.registerEmployer(employer);
	}
	
	@PostMapping("/registerCandinate")
	public Result registerJobseeker(@RequestBody CandidateUser candidateUser)
	{
		return authService.registerCandinateUser(candidateUser);
	}

}
