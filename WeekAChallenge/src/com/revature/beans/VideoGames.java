package com.revature.beans;

public class VideoGames {
	
	private String title;
	private String genre;
	private String rating;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "VideoGames [title=" + title + ", genre=" + genre + ", rating=" + rating + "]";
	}
	
}
