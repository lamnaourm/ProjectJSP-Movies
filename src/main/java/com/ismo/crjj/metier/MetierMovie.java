package com.ismo.crjj.metier;

import java.util.List;

import com.ismo.crjj.dao.DaoMovie;
import com.ismo.crjj.dao.IDaoMovie;
import com.ismo.crjj.models.Movie;

public class MetierMovie implements IMetierMovie<Movie>{
	
	IDaoMovie<Movie> dao = new DaoMovie();

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public List<Movie> getAllMoviesByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMoviesByYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMoviesByDirector(String director) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMoviesByActor(String actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getOneMovie(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
