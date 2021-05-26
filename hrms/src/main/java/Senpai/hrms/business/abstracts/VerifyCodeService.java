package Senpai.hrms.business.abstracts;

import Senpai.hrms.core.utilities.results.Result;


public interface VerifyCodeService {

	Result add (int UserId);
	String generateCode ();
}
