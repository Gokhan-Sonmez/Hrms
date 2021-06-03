package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education,Integer> {

}
