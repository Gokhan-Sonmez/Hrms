package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.CandidateUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.CandidateUserDao;
import HrmsProject.Hrms.entities.concretes.CandidateUser;

@Service
public class CandidateUserManager implements CandidateUserService {

	private CandidateUserDao candidateUserDao;
	
	@Autowired
	public CandidateUserManager(CandidateUserDao candidateUserDao) {
		
		this.candidateUserDao = candidateUserDao;
	}

	@Override
	public DataResult<List<CandidateUser>> getAll() {
		
		return new SuccessDataResult<List<CandidateUser>>(candidateUserDao.findAll(),"data listed");
	}

	@Override
	public Result add(CandidateUser candidateUser) {
		
		candidateUserDao.save(candidateUser);
		return new SuccessResult("candidateUser added");
	}

	@Override
	public DataResult<CandidateUser> getByIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<CandidateUser>
		(candidateUserDao.getByIdentityNumber(identityNumber));
	}
	
	

	

}
