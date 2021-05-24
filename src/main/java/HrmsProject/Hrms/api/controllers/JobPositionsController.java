package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.JobPositionService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
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
	public DataResult<List<JobPosition>> getAll(){
		
		return this.jobPositionservice.getAll();
		
	}
	
	@GetMapping("/jobpositions/{id}")
	public DataResult<JobPosition> getById(@PathVariable int id){
		
		return this.jobPositionservice.getById(id);
		
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition){
		
		return jobPositionservice.add(jobPosition);
		
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobPosition jobPosition){
		
		return jobPositionservice.update(jobPosition);
		
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobPosition jobPosition){
		
		JobPosition jobPositionToDelete = jobPositionservice.getById(jobPosition.getId()).getData();
		return jobPositionservice.delete(jobPositionToDelete);
		
	}

}
