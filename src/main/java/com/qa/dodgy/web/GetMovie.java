package com.qa.dodgy.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qa.dodgy.business.repository.IMovieRepository;
import com.qa.dodgy.persistence.domain.Movie;

@WebServlet(name = "GetMovie", urlPatterns = {"/movie"})
public class GetMovie extends HttpServlet {
	@Inject
	private IMovieRepository repo;
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/html;charset=UTF-8");
        long movieId = Long.parseLong(request.getParameter("movieId"));

        Movie movie = repo.getMovie(movieId);
        request.setAttribute("movie", movie);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("movie-page.jsp");
        dispatcher.forward(request, response);
    }

}
