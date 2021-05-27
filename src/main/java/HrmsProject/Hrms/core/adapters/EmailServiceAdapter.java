package HrmsProject.Hrms.core.adapters;

import org.springframework.stereotype.Service;

import HrmsProject.Hrms.core.services.EmailService;

@Service
public class EmailServiceAdapter implements EmailService{

	@Override
	public void send(String email) {
		
		System.out.println("Activasyon maili gönderildi" + email);
		
	}

}
