package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.VerificationJobPosting;

public interface VerificationJobPostingService {
	
	 Result verify (VerificationJobPosting verify);
	 DataResult<List<VerificationJobPosting>> getAll();

}
