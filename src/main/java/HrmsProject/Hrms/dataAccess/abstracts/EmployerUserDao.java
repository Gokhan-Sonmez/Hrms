package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.EmployerUser;

public interface EmployerUserDao extends JpaRepository<EmployerUser,Integer> {

}
