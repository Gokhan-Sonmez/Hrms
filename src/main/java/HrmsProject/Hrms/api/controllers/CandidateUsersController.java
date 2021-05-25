package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.CandidateUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.CandidateUser;

@RestController
@RequestMapping("/api/candidateusers")
public class CandidateUsersController {
	
	private CandidateUserService candidateUserService;

	@Autowired
	public CandidateUsersController(CandidateUserService candidateUserService) {
		super();
		this.candidateUserService = candidateUserService;
	}
	
	@GetMapping("/getall")
	DataResult<List<CandidateUser>> getAll(){
		
		return this.candidateUserService.getAll();
	}
	
	@PostMapping("/add")
	Result add(CandidateUser candidateUser) {
		return this.candidateUserService.add(candidateUser);
		
	}
	

}
