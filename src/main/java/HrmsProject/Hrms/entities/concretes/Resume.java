package HrmsProject.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="resumes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","experiences","skills","languages"})
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="github")
	private String github;
	
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="candidate_user_id")
	private CandidateUser candidateUser;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Education> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Experience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Language> languages;

}
