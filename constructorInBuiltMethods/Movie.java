package com.constructorInBuiltMethods;

public class Movie {
String movieName;
String Genre;
String rating;
 
public Movie(String movieName, String Genre, String rating) {
	this.movieName= movieName;
	this.Genre= Genre;
	this.rating= rating;

}

@Override
public String toString() {
	return "Movie [movieName=" + movieName + ", Genre=" + Genre + ", rating=" + rating + "]";
}
}
