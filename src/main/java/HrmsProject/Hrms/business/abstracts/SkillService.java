package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.Skill;

public interface SkillService {

	
	DataResult<List<Skill>> getAll();

    Result add(Skill skill);
}
