package pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Embeddable
public class AdharCard {

	@Column(name="adhar_card_number")
	private long adharCardNumber;
	
	@Column(name="creation_date")
	@CreationTimestamp
	private LocalDate creationDate;
	
	private String location;

	public AdharCard() {
		super();
	}

	public AdharCard(long adharCardNumber, LocalDate creationDate, String location) {
		super();
		this.adharCardNumber = adharCardNumber;
		this.creationDate = creationDate;
		this.location = location;
	}

	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AdharCard [adharCardNumber=" + adharCardNumber + ", creationDate=" + creationDate + ", location="
				+ location + "]";
	}
	
	
}
