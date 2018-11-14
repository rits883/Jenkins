package com.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.pojo.Movie;

public class DisplayMovie {

	public static void main(String[] args) {

		List<Movie> mList= 
				new ArrayList<>(
						Arrays.asList(new Movie("Toofan","PVR Saket","9:00 AM"),
								new Movie("Robot 2.0","PVR Malviya","7:00 AM"),
								new Movie("Uri","PVR Gurgaon","8:00 AM"),
								new Movie("DDLJ","PVR Rohoini","11:00 AM"),
								new Movie("Uri","PVR Saket","12:00 PM"),
								new Movie("Uri","PVR Saket","3:00 PM"),
								new Movie("Uri","PVR Saket","6:00 PM")
	
								));
		DisplayMovie  dm = new DisplayMovie();
		dm.m1(mList);
	}
	
	public void m1(List<Movie> movieList) {
		Function<List<Movie>,List<Movie>> sortedList = (mList)->{
			mList.sort((Movie m1 , Movie m2)->m1.getMovieName().compareTo(m2.getMovieName()));
		return mList;};	
		
		Predicate<Movie> checkMovieByName = (movie) ->movie.equals("Uri");
		
		Consumer<List<Movie>> display =  (mList)->{
			mList.forEach((movie)->System.out.println(movie.getMovieName()));
			
		};
		
		
 
		 
	
	}
}
