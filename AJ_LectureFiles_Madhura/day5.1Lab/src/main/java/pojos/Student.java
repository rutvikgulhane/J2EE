package pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {
	
	@Column(name="first_name", length = 30)
	private String firstName;

	@Column( name="last_name",length = 30)
	private String lastName;

	@Column(length = 30)
	private String email;
	
	@Embedded
	private AdharCard adharCard;
	
	// Corse 1--->*Admissoins
	@OneToMany(mappedBy = "student", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	private List<Admission> admissions = new ArrayList<Admission>();
	
	@ManyToMany
	@JoinTable(name="student_project", 
	joinColumns = {@JoinColumn(name="fk_student_id")},
	inverseJoinColumns = {@JoinColumn(name="fk_project_id")})
	private Set<Project> projects = new HashSet<Project>();
	
	
	public Student() {}

	public Student(String firstName, String lastName, String email, AdharCard adharCard) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adharCard = adharCard;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	public List<Admission> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<Admission> admissions) {
		this.admissions = admissions;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", adharCard="
				+ adharCard + "]";
	}

	
}
