package HrmsProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.Hrms.business.abstracts.CityService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	
	private CityService cityServcie;

	@Autowired
	public CitiesController(CityService cityServcie) {
		super();
		this.cityServcie = cityServcie;
	}
	
	@GetMapping("/getall")
	DataResult<List<City>> getAll(){
		
		return cityServcie.getAll();
	}
	@GetMapping("/getbyname")
	 DataResult<City> getByName(@RequestParam String name){
		
		return cityServcie.getByName(name);
	}
	@PostMapping("/add")
	 Result add(@RequestBody City city){
		
		return cityServcie.add(city);
	}
	
	
	

}
