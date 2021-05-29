package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.entities.concretes.City;

public interface CityService {

	 DataResult<List<City>> getAll();
	 
	 DataResult<City> getByName(String name);
	 
}
