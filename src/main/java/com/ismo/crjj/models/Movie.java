package com.ismo.crjj.models;

public class Movie {

	private int id;
	private String title;
	private int year;
	private int runtime;
	private String genre1;
	private String genre2;
	private String genre3;
	private String director;
	private String actors;
	private String plot;
	private String poster;
	
	public Movie() {
		
	}
	
	public Movie(int id, String title, int year, int runtime, String genre1, String genre2, String genre3,
			String director, String actor1, String actor2, String actor3, String actor4, String plot, String poster) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.genre1 = genre1;
		this.genre2 = genre2;
		this.genre3 = genre3;
		this.director = director;
		this.actor1 = actor1;
		this.actor2 = actor2;
		this.actor3 = actor3;
		this.actor4 = actor4;
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
	public String getActor1() {
		return actor1;
	}
	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}
	public String getActor2() {
		return actor2;
	}
	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}
	public String getActor3() {
		return actor3;
	}
	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}
	public String getActor4() {
		return actor4;
	}
	public void setActor4(String actor4) {
		this.actor4 = actor4;
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
	
	

	
}
