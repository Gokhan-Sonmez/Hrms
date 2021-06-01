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
@Table(name="resumes")

public class Resume {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="candidate_user_id")
	private int candidateUserId;
	
	@Column(name="education_id")
	private int educationId;
	
	@Column(name="experience_id")
	private int experienceId;
	
	@Column(name="language_id")
	private int languageId;
	
	@Column(name="skill_id")
	private int skillId;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="github")
	private String github;
	
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="cover_letter")
	private String coverLetter;
	

}
