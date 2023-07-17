package example.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Table(name="my_student_table")
public class Student {
	@Id
	@Column(name="student_id")
    private int id;
	@Column(name="student_name")
    private String name;
	@ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "student_course")
    private Collection<Course> courses ;
	public Student() {
		super();
		id = new Random().nextInt(10000);	
		
	}
	
}
