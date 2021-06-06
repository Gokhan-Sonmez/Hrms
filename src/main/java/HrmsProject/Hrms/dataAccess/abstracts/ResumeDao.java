package HrmsProject.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume,Integer>{
	
	List<Resume> getByCandidateUser(int candidateUserId);

}
