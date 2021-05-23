package Senpai.hrms.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.UserService;
//import Senpai.hrms.core.utilities.results.DataResult;
//import Senpai.hrms.core.utilities.results.Result;
//import Senpai.hrms.core.utilities.results.SuccessDataResult;
//import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.UserDao;
//import Senpai.hrms.entities.concretes.User;
//import java.util.List;
@Service
public class UserManager implements UserService {

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

//	@Override
//	public Result add(User user) {
//		this.userDao.save(user);
//		return new SuccessResult();
//	}
//
//	@Override
//	public Result update(User user) {
//		this.userDao.save(user);
//		return new SuccessResult();
//	}
//
//	@Override
//	public Result delete(User user) {
//		this.userDao.delete(user);
//		return new SuccessResult();
//	}
//
//	@Override
//	public DataResult<List<User>> getAll() {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<List<User>> (this.userDao.findAll());
//	}
//
//	@Override
//	public DataResult<User> get(int id) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<User> (this.userDao.findById(id).get());
//	}

}
