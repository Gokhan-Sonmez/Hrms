package HrmsProject.Hrms.core.services;

public interface MernisService {

	boolean checkIfRealPerson(String identityNumber,String firstName,String lastName,int birthYear);
	
}
