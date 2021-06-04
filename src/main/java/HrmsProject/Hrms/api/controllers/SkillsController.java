package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.SkillService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

	private SkillService skilService;

	@Autowired
	public SkillsController(SkillService skilService) {
		super();
		this.skilService = skilService;
	}
	
	@GetMapping("/getall")
	DataResult<List<Skill>> getAll(){
		
		return this.skilService.getAll();
	}
	
	@PostMapping("/add")
    Result add(@RequestBody Skill skill) {
    	
    	return this.skilService.add(skill);
    	
    }
}
