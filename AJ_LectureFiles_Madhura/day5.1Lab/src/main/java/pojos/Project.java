package pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table
public class Project extends BaseEntity{

	private String title;
	
	@Column(name="completion_time")
	private  LocalDate completionTime;
	
	@ManyToMany(mappedBy = "projects")
	private Set<Student> students = new HashSet<>();
	
}
