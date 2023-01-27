package pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;



@Entity
@Table(name = "admissions", uniqueConstraints = 
@UniqueConstraint(columnNames = {"course_id", "student_id"}))
public class Admission extends BaseEntity{

	@Column(name="application_date")
	@CreationTimestamp
	private LocalDate applicationDate;

	@Column(name="result_date")
	private LocalDate resultDate; 
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course chosenCourse;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	public Admission() {
		super();
	}

	public Admission(LocalDate applicationDate, LocalDate resultDate, Status status) {
		super();
		this.applicationDate = applicationDate;
		this.resultDate = resultDate;
		this.status = status;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LocalDate getResultDate() {
		return resultDate;
	}

	public void setResultDate(LocalDate resultDate) {
		this.resultDate = resultDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Course getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(Course chosenCourse) {
		this.chosenCourse = chosenCourse;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Admission [applicationDate=" + applicationDate + ", resultDate=" + resultDate + ", status=" + status
				+ ", chosenCourse=" + chosenCourse + ", student=" + student + "]";
	}
	
	
	
	
}
