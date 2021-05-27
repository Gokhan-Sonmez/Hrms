package HrmsProject.Hrms.core.adapters;

import org.springframework.stereotype.Service;

import HrmsProject.Hrms.core.services.MernisService;
@Service
public class MernisServiceAdapter implements MernisService {

	@Override
	public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		
		return true;
	}

	
}
