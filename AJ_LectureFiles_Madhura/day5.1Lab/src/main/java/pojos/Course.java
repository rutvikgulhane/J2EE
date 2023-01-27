package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course extends BaseEntity {
	
	@Column(length = 30)
	private String title;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	private double fees;

	private int capacity;
	
	// Corse 1--->*Admissoins
	@OneToMany(mappedBy = "chosenCourse", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	private List<Admission> admissions= new ArrayList<>();

	public Course() {}

	public Course(String title, LocalDate startDate, LocalDate endDate, double fees, int capacity) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Course: " + getId() + " [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", fees=" + fees + ", capacity=" + capacity + "]";
	}

}
