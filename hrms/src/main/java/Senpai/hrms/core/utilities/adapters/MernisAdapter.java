package Senpai.hrms.core.utilities.adapters;



import org.springframework.stereotype.Service;


@Service
public class MernisAdapter implements MernisService {
	
	@Override
	public boolean validatePerson(String tc, String firstName, String lastName, int birtDate) {
		
		//fake mernis
		return true;
	}

}
