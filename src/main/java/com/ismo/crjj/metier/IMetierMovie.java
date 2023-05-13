package com.ismo.crjj.metier;

import java.util.List;

public interface IMetierMovie<T> {

	List<T> getAllMovies();
	List<T> getAllMoviesByGenre(String genre);
	List<T> getAllMoviesByYear(int year);
	List<T> getAllMoviesByDirector(String director);
	List<T> getAllMoviesByActor(String actor);
	T getOneMovie(int id);
}
