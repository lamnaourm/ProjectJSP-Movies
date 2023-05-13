package com.ismo.crjj.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_movie")
public class Movie {

	@Id
	private int id;
	
	@Column
	private String title;
	
	@Column
	private int year;
	
	@Column
	private int runtime;
	
	@Column
	private String genre1;
	
	@Column
	private String genre2;
	
	@Column
	private String genre3;
	
	@Column
	private String director;
	
	@Column
	private String actors;
	
	@Column
	private String plot;
	
	@Column(name="posterURL")
	private String poster;
	
	public Movie() {
		
	}
	
	public Movie(int id, String title, int year, int runtime, String genre1, String genre2, String genre3,
			String director, String actors, String actor4, String plot, String poster) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.genre1 = genre1;
		this.genre2 = genre2;
		this.genre3 = genre3;
		this.director = director;
		this.actors = actors;
		this.plot = plot;
		this.poster = poster;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getGenre1() {
		return genre1;
	}
	public void setGenre1(String genre1) {
		this.genre1 = genre1;
	}
	public String getGenre2() {
		return genre2;
	}
	public void setGenre2(String genre2) {
		this.genre2 = genre2;
	}
	public String getGenre3() {
		return genre3;
	}
	public void setGenre3(String genre3) {
		this.genre3 = genre3;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}
	
	

	
}
