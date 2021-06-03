package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.ExperienceService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.ExperienceDao;
import HrmsProject.Hrms.entities.concretes.Experience;


@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
	
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		return new SuccessDataResult<List<Experience>>(experienceDao.findAll(),"Tecrübe listelendi");
		
	}

	@Override
	public Result add(Experience experience) {
		experienceDao.save(experience);
		return new SuccessResult("Başarıyla eklendi");
	}

}
