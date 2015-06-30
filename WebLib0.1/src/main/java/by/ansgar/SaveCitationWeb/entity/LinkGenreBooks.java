package by.ansgar.SaveCitationWeb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "link_genre_books")
public class LinkGenreBooks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@ManyToOne
	@JoinColumn(name = "books_id",referencedColumnName = "id")
	private Books books;
	@ManyToOne
	@JoinColumn(name = "genre_id",referencedColumnName = "id")
	private Genre genre;

	public LinkGenreBooks() {

	}

	public LinkGenreBooks(long id, Books books, Genre genre) {
		this.id = id;
		this.books = books;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}



}
