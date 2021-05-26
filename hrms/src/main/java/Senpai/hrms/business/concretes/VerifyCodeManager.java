package Senpai.hrms.business.concretes;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.VerifyCodeService;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.VerificationCodeDao;
import Senpai.hrms.entities.concretes.VerificationCode;
@Service
public class VerifyCodeManager implements VerifyCodeService {

	private VerificationCodeDao verification;
   
	@Autowired
	public VerifyCodeManager(VerificationCodeDao verification) {
		super();
		this.verification = verification;
	}

	@Override
	public Result add(int UserId) {
		VerificationCode verifyCode= new VerificationCode();
		
		verifyCode.setCode(this.generateCode());
		
		this.verification.save(verifyCode);
		return new SuccessResult();
	}
	
	public String generateCode () {
		
		UUID code= UUID.randomUUID();
		
		return code.toString();
	}
	
	
}
