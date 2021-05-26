package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {

	User findUserByEmail(String email);
}
