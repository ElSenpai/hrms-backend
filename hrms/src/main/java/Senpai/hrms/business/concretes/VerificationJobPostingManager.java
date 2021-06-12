package Senpai.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.VerificationJobPostingService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.VerificationJobPostingDao;
import Senpai.hrms.entities.concretes.VerificationJobPosting;
@Service
public class VerificationJobPostingManager implements VerificationJobPostingService {

	private VerificationJobPostingDao verification;
	
	@Autowired
	public VerificationJobPostingManager(VerificationJobPostingDao verification) {
		super();
		this.verification = verification;
	}


	@Override
	public Result verify(VerificationJobPosting verify) {
		verify.setConfirmDate(LocalDate.now());
		this.verification.save(verify);
		return new SuccessResult();
	}


	@Override
	public DataResult<List<VerificationJobPosting>> getAllConfirmed() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<VerificationJobPosting>>(this.verification.getByIsActive());
	}

}
