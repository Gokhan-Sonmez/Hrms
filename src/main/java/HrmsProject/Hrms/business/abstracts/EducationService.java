package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Education;

public interface EducationService {

	
	DataResult<List<Education>> getAll();

    Result add(Education education);
}
