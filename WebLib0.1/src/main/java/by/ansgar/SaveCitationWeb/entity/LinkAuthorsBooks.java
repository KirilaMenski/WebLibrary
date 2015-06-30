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
@Table(name="link_authors_books_web")
public class LinkAuthorsBooks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@ManyToOne
	@JoinColumn(name="authors_id", referencedColumnName="id")
	private Authors authors;
	@ManyToOne
	@JoinColumn(name="books_id", referencedColumnName="id")
	private Books books;
	
	public LinkAuthorsBooks(){
		
	}

	public LinkAuthorsBooks(long id, Authors authors, Books books) {
		this.id = id;
		this.authors = authors;
		this.books = books;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Authors getAuthors() {
		return authors;
	}

	public void setAuthors(Authors authors) {
		this.authors = authors;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

}
