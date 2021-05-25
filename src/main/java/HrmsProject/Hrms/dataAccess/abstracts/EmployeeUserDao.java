package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.EmployeeUser;

public interface EmployeeUserDao extends JpaRepository<EmployeeUser,Integer> {

}
