package example.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@Table(name="my_course_table")

public class Course {
	@Id
	@Column(name="course_id")

	private int id;
	@Column(name="course_name")
    private String courseName;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "courses")
    private Collection<Student> students ;
	public Course() {
		super();
		id= new Random().nextInt(10000);
	}
	
}
