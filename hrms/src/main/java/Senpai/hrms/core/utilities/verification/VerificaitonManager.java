package Senpai.hrms.core.utilities.verification;

public class VerificaitonManager implements VerificationService {

	@Override
	public void verifyByCode() {
		System.out.println("Code send your email");
		
	}

	@Override
	public void verifyByEmployee() {
		System.out.println("Verify by employer");
		
	}

	
}
