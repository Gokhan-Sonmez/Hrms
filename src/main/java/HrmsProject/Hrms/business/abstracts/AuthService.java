package HrmsProject.Hrms.business.abstracts;


import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.CandidateUser;
import HrmsProject.Hrms.entities.concretes.EmployerUser;


public interface AuthService {


	Result registerEmployer(EmployerUser employer);
	Result registerCandinateUser(CandidateUser candidate);
	
}


