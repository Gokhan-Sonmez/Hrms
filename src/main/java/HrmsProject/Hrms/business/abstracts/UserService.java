package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.User;

public interface UserService {

	Result add(User user);
	
	DataResult<User> getUserByEmail(String email);
	
	DataResult<List<User>> getAll();
	
}
