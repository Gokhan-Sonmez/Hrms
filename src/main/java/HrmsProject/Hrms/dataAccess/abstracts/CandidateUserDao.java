package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.CandidateUser;

public interface CandidateUserDao extends JpaRepository<CandidateUser,Integer>{
	
	CandidateUser getByIdentityNumber(String identityNumber);

	
}
