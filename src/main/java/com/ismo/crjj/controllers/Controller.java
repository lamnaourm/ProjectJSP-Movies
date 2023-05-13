package com.ismo.crjj.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ismo.crjj.metier.IMetierMovie;
import com.ismo.crjj.metier.MetierMovie;
import com.ismo.crjj.models.Movie;

/**
 * Servlet implementation class Controller
 */
@WebServlet(name="Controller",urlPatterns = "/do/*")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	IMetierMovie<Movie> metier = new MetierMovie(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch (request.getPathInfo()) {
		case "/home": 
			List<Movie> movies = metier.getAllMovies();
			request.setAttribute("movies", movies);
			request.getRequestDispatcher("/pages/listmovies.jsp").forward(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
