package HrmsProject.Hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.JobAdvertisementService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	DataResult<List<JobAdvertisement>> getAll(){
		
		return jobAdvertisementService.getAll();
		
	}
	
	@GetMapping("/getallbyemployerUser")
	DataResult<List<JobAdvertisement>> getAllByEmployerUser(@RequestParam int employerId){
		return jobAdvertisementService.getAllByEmployerUser(employerId);
		
		
	}
	
	@GetMapping("/getallbystatus")
	DataResult<List<JobAdvertisement>> getAllByStatus(@RequestParam Boolean status){
		return jobAdvertisementService.getAllByStatus(status);
		
		
	}
	
	@GetMapping("/getallbycreatedate")
	DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDate(){
		return jobAdvertisementService.getByStatusTrueOrderByCreateDate();
		
	}
	
	@GetMapping("/getallbycompanyname")
	DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployerUser_CompanyName(@RequestParam String companyName){
		return jobAdvertisementService.getByStatusTrueAndEmployerUser_CompanyName(companyName);
		
	}
	@PostMapping("/add")
	Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return jobAdvertisementService.add(jobAdvertisement);
		
	}
	
	

}
