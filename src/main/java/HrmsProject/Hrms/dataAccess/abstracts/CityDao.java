package HrmsProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
	
	
	City getByName(String name);

}
