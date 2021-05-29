package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.CandidateUser;

public interface CandidateUserService {

	
    DataResult<List<CandidateUser>> getAll();

	
    DataResult<CandidateUser> getByIdentityNumber(String identityNumber);
    
	Result add(CandidateUser candidateUser);
	
	
	
}