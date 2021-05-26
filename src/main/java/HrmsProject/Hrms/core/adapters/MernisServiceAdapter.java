package HrmsProject.Hrms.core.adapters;

import HrmsProject.Hrms.core.services.MernisService;

public class MernisServiceAdapter implements MernisService {

	@Override
	public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		
		return true;
	}

	
}
