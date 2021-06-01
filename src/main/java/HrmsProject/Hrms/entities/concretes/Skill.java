package HrmsProject.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="skills")
public class Skill {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

}
