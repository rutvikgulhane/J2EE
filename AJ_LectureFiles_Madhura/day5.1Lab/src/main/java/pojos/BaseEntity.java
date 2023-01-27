package pojos;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	public BaseEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	

}
