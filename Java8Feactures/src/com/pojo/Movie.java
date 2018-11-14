package com.pojo;

public class Movie {
	
	private String movieName;
	private String movieTheater;
	private String time;
	
	
	public Movie(String movieName ,String movieTheater ,String time) {
		this.movieName = movieName;
		this.movieTheater = movieTheater;
		this.time = time;
				
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :- "+movieName +" Theater "+movieTheater +" Time "+time ;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTheater() {
		return movieTheater;
	}
	public void setMovieTheater(String movieTheater) {
		this.movieTheater = movieTheater;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	

}
