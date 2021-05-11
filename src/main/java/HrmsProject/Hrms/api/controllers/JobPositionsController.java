package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.JobPositionService;
import HrmsProject.Hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionservice;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionservice) {
		super();
		this.jobPositionservice = jobPositionservice;
	}

	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return this.jobPositionservice.getAll();
		
	}

}
