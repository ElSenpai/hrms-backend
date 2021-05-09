package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.UserService;
import Senpai.hrms.dataAccess.abstracts.UserDao;
import Senpai.hrms.entities.concretes.User;
@Service
public class UserManager implements UserService {

	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		this.userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.save(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return this.userDao.findById(id).get();
	}

}
