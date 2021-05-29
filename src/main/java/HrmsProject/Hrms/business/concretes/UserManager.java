package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.UserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.UserDao;
import HrmsProject.Hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("User added");
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(userDao.findAll(),"User listed");
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		
		return new SuccessDataResult<User>(userDao.getByEmail(email),"User listed");
	}

}
