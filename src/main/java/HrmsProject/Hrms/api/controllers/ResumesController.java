package HrmsProject.Hrms.api.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import HrmsProject.Hrms.business.abstracts.ResumeService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {
	
	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getall")
	DataResult<List<Resume>> getAll(){
		return this.resumeService.getAll();
	}
	
	@GetMapping("/getbyid")
    DataResult<Resume> getById(int id){
    	return this.resumeService.getById(id);
    }
	
	@GetMapping("/getbycandidateid")
	DataResult<List<Resume>> getByCandidate_Id(@RequestParam int id){
		
		return this.resumeService.getByCandidate_Id(id);
	}
	
	 @PostMapping("/add")
	Result add(@RequestBody Resume resume) {
		
		return this.resumeService.add(resume);
	}
	 
	 @PostMapping("/addimage")
    Result addImage(@RequestBody MultipartFile multipartFile, int id) throws IOException{
    	return this.resumeService.addImage(multipartFile, id);
    }
	 
	 @PostMapping("/update")
    Result update(@RequestBody Resume resume) {
    	return this.resumeService.update(resume);
    }

}
