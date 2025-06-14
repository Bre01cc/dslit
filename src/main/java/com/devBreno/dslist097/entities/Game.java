package com.devBreno.dslist097.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String title;
	
	@Column(name ="game_year")
	private Integer year;
	private String genre;
	private String platform;
	private double score;
	private String imgUrl;
	private String shorDescription;
	private String longDescription;

	public Game() {

	}

	public Game(long id, String title, Integer year, String genre, String platform, double score, String imgUrl,
			String shorDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shorDescription = shorDescription;
		this.longDescription = longDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShorDescription() {
		return shorDescription;
	}

	public void setShorDescription(String shorDescription) {
		this.shorDescription = shorDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return id == other.id;
	}

}
