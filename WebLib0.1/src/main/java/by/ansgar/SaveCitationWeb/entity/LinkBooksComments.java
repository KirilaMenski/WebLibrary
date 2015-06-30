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
@Table(name = "link_books_comments_web")
public class LinkBooksComments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@ManyToOne
	@JoinColumn(name = "books_id", referencedColumnName = "id")
	private Books books;
	@ManyToOne
	@JoinColumn(name = "comments_id", referencedColumnName = "id")
	private BooksComments booksCom;

	public LinkBooksComments() {

	}

	public LinkBooksComments(long id, Books books, BooksComments booksCom) {
		this.id = id;
		this.books = books;
		this.booksCom = booksCom;
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

	public BooksComments getBooksCom() {
		return booksCom;
	}

	public void setBooksCom(BooksComments booksCom) {
		this.booksCom = booksCom;
	}

}
