package HrmsProject.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import HrmsProject.Hrms.business.abstracts.AuthService;
import HrmsProject.Hrms.business.abstracts.CandidateUserService;
import HrmsProject.Hrms.business.abstracts.EmployerUserService;
import HrmsProject.Hrms.business.abstracts.UserService;
import HrmsProject.Hrms.core.services.EmailService;
import HrmsProject.Hrms.core.services.MernisService;
import HrmsProject.Hrms.core.utilities.results.ErrorResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;

import HrmsProject.Hrms.entities.concretes.CandidateUser;
import HrmsProject.Hrms.entities.concretes.EmployerUser;


@Service
public class AuthManager implements AuthService{

	private UserService userService;
	private EmployerUserService employerService;
	private CandidateUserService candidateService;
	private EmailService emailService;
	private MernisService mernisService;
	
	@Autowired
	public AuthManager(UserService userService,EmailService emailService,MernisService mernisService,
			EmployerUserService employerService,CandidateUserService candidateService) {
		super();
		this.userService = userService;
		this.emailService = emailService;
		this.mernisService = mernisService;
		this.candidateService = candidateService;
		this.employerService = employerService;
		
	}


	@Override
	public Result registerEmployer(EmployerUser employer) {
		
		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebAddress())) {

			return new ErrorResult("Invalid email address.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + " already exists.");
		}
		
		employerService.add(employer);
		emailService.send(employer.getEmail());
		return new SuccessResult("Registration has been successfully completed");
	}




	@Override
	public Result registerCandinateUser(CandidateUser candidate) {
		
		if (checkIfRealPerson((candidate.getIdentityNumber()), candidate.getFirstName(),
				candidate.getLastName(), candidate.getDateOfBirth().getYear()) == false) {
			return new ErrorResult("TCKN could not be verified.");
		}

		
		if (!checkIfExistsTcNo(candidate.getIdentityNumber())) {

			return new ErrorResult(candidate.getIdentityNumber() + " already exists.");
		}

		if (!checkIfEmailExists(candidate.getEmail())) {

			return new ErrorResult(candidate.getEmail() + " already exists.");
		}

		
		
		candidateService.add(candidate);
		emailService.send(candidate.getEmail());
		return new SuccessResult("Registration has been successfully completed");
	}
	
	
	
	
	private boolean checkIfEmailExists(String email) {

		if (this.userService.getUserByEmail(email).getData() == null) {

			return true;
		}

		return false;
	}
	
	private boolean checkIfEqualEmailAndDomain(String email, String webAddress) {
		String[] emailArr = email.split("@", 2);
		String domain = webAddress.substring(4, webAddress.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}
	
	private boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, int yearOfBirth) {

		if (mernisService.checkIfRealPerson(identityNumber, firstName, lastName, yearOfBirth)) {
			return true;
		}
		return false;
	}
	
	private boolean checkIfExistsTcNo(String identityNumber) {

		if (this.candidateService.findByNationalityNumber(identityNumber).getData() == null) {
			return true;
		}
		return false;
	}


}
