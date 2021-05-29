package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.JobPosition;

public interface JobPositionDao  extends JpaRepository<JobPosition,Integer>{

	JobPosition getByName(String name);
	
}
