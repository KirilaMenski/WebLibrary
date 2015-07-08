package by.ansgar.weblib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books_web")
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="picture")
	private String picture;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="year")
	private int year;
	@Column(name="series")
	private String series;
	@Column(name="num_series")
	private int num_series;
	@Column(name="description")
	private String description;
	@Column(name="date")
	private String date;
	@Column(name="authId")
	private long authId;
	
	public Books(){
		
	}

	public Books(long id, String picture, String title, String series,
			int num_series, String description, String date, String author, int year, long authId) {
		this.id = id;
		this.picture = picture;
		this.title = title;
		this.series = series;
		this.num_series = num_series;
		this.description = description;
		this.date = date;
		this.year = year;
		this.author = author;
		this.authId = authId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getNum_series() {
		return num_series;
	}

	public void setNum_series(int num_series) {
		this.num_series = num_series;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getAuthId() {
		return authId;
	}

	public void setAuthId(long authId) {
		this.authId = authId;
	}
	
	
}
