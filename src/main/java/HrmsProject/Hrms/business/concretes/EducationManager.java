package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.EducationService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.EducationDao;
import HrmsProject.Hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	
	private EducationDao educationDao;
	@Autowired
	public EducationManager(EducationDao educationDao) {
		
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(educationDao.findAll(),"Eğitim listelendi");
		
	}

	@Override
	public Result add(Education education) {
		educationDao.save(education);
		return new SuccessResult("Başarıyla eklendi");
	}

}
