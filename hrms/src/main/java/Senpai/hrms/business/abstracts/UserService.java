package Senpai.hrms.business.abstracts;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.entities.concretes.User;

//import java.util.List;

//import Senpai.hrms.core.utilities.results.DataResult;
//import Senpai.hrms.core.utilities.results.Result;
//import Senpai.hrms.entities.concretes.User;

public interface UserService {

//	Result add(User user);
//	Result update(User user);
//	Result delete(User user);
//	
//	DataResult<List<User>> getAll();
//	DataResult<User> get(int id);
	
	DataResult<User> checkEmail(String email);
}
