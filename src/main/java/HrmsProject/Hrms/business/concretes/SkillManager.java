package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.SkillService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.SkillDao;
import HrmsProject.Hrms.entities.concretes.Skill;
@Service
public class SkillManager implements SkillService {

	
	private SkillDao skillDao;
	@Autowired
	public SkillManager(SkillDao skillDao) {
		
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(skillDao.findAll(),"yenetekler listelendi");
	}

	@Override
	public Result add(Skill skill) {
		skillDao.save(skill);
		return new SuccessResult("Başarıyla eklendi");
	}

}
