package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.ExperienceService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	
	private ExperienceService experienceService;

	@Autowired
	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	
	DataResult<List<Experience>> getAll()
	{
		return this.experienceService.getAll();
	}

    Result add(@RequestBody Experience experience)
    {
    	return this.experienceService.add(experience);
    }

}
