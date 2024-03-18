package com.kodnest.tunehub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {
	
	
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int id;
	String name;
	String genre;
	String link;
	String artist;
	@ManyToMany
	List<Playlist> playlists;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(int id, String name, String genre, String link, String artist, List<Playlist> playlists) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.link = link;
		this.artist = artist;
		this.playlists = playlists;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", genre=" + genre + ", link=" + link + ", artist=" + artist
				+ ", playlists=" + playlists + "]";
	}
	
	

}
