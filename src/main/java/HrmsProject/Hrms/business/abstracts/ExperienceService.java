package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Experience;


public interface ExperienceService {

	
	DataResult<List<Experience>> getAll();

    Result add(Experience experience);
}
