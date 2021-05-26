package HrmsProject.Hrms.core.services;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {

	void send(String email);
}
