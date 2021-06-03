package HrmsProject.Hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name ="user_id", referencedColumnName ="id")
@AllArgsConstructor 
@NoArgsConstructor
public class CandidateUser extends User {

	@Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_identity")
    private String identityNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    
    @OneToMany(mappedBy = "candidateUser")
    private List<Resume> resumes;
    
}
