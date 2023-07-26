package org.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "league_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LeagueEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leagueId;
	private int year;
	private String season;
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LeagueEntity(int string, String season, String title) {
		super();
		this.year = string;
		this.season = season;
		this.title = title;
}

}