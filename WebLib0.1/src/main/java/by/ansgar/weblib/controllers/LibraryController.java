package by.ansgar.weblib.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.ansgar.weblib.entity.Authors;
import by.ansgar.weblib.entity.Books;
import by.ansgar.weblib.entity.BooksComments;
import by.ansgar.weblib.entity.Genre;
import by.ansgar.weblib.entity.LinkAuthorsBooks;
import by.ansgar.weblib.entity.LinkBooksComments;
import by.ansgar.weblib.entity.LinkGenreBooks;
import by.ansgar.weblib.service.AuthorsService;
import by.ansgar.weblib.service.BooksCommentsService;
import by.ansgar.weblib.service.BooksService;
import by.ansgar.weblib.service.GenreService;
import by.ansgar.weblib.service.LinkAuthorsBooksService;
import by.ansgar.weblib.service.LinkBooksCommentsService;
import by.ansgar.weblib.service.LinkGenreBooksService;

@Controller
public class LibraryController {

	@Autowired
	private GenreService genreService;
	@Autowired
	private BooksService booksService;
	@Autowired
	private LinkGenreBooksService linkGenreBooksService;
	@Autowired
	private LinkBooksCommentsService linkBooksComService;
	@Autowired
	private BooksCommentsService booksComService;
	@Autowired
	private AuthorsService authorService;
	@Autowired
	private LinkAuthorsBooksService linkAuthBookService;

	private long genreId;
	private long booksId;
	private long authId;

	/*
	 * LIBRARY BLOCK
	 */
	@RequestMapping(value = "/savecitation_lib", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView libPage() throws SQLException {
		ModelAndView modelView = new ModelAndView();
		List<Genre> genre = genreService.getAllGenre();
		modelView.addObject("genre", genre);

		modelView.setViewName("SaveCitationWeb_Library");
		return modelView;
	}

	@RequestMapping(value = "/addGenrePage", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView addGenrePage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_AddGenre");
		return modelView;
	}

	@RequestMapping(value = "/addGenre", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addGenre(@ModelAttribute Genre genre, BindingResult results) {

		try {
			genreService.addGenre(genre);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_lib";
	}

	@RequestMapping(value = "savecitation_genre_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String viewGenre(@PathVariable long id, Model model) {

		try {
			List<LinkGenreBooks> genreBooks = linkGenreBooksService
					.getGenreBooks(id);
			genreId = id;
			model.addAttribute("genreBooks", genreBooks);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_Genre";
	}

	@RequestMapping(value = "addBooksPage", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addBookPage() {

		return "SaveCitationWeb_AddBook";
	}

	@RequestMapping(value = "addBooks", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addBook(@ModelAttribute Books books, BindingResult result) {

		try {
			authId = books.getAuthId();
			System.out.println(books.getAuthId());
			booksService.addBooks(books);
			assigmentGenreBooks(genreId);
			assigmentAuthBooks(authId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_lib";
	}
	
	@RequestMapping(value = "addAuthorPage", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addAuthorPage() {

		return "SaveCitationWeb_AddAuthor";
	}
	
	@RequestMapping(value = "addAuthors", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addAuthor(@ModelAttribute Authors authors, BindingResult result) {

		try {
			authorService.addAuthor(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_lib";
	}

	@RequestMapping(value = "savecitation_viewbook_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String viewBook(@PathVariable long id, Model model) {

		try {
			Books books = booksService.getBooksById(id);
			booksId = id;
			model.addAttribute("books", books);
			// List<LinkAuthorsBooks> linkAuthBooks = linkAuthBookService
			// .getAuthorsBooks(id);
			// model.addAttribute("books", linkAuthBooks);
			List<LinkBooksComments> linkBookCom = linkBooksComService
					.getComent(id);
			model.addAttribute("linkBookCom", linkBookCom);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_ViewBook";
	}

	@RequestMapping(value = "addBookComment", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addBooksComents(@ModelAttribute BooksComments booksCom,
			BindingResult result) {
		try {
			booksComService.addComments(booksCom);
			assigmentBooksCom(booksId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/savecitation_lib";
	}

	@RequestMapping(value = "savecitation_viewauthor_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String viewAuthor(@PathVariable long id, Model model) {
		try {
			System.out.println(id);
			Authors author = authorService.getAuthor(id);
			model.addAttribute("author", author);

			List<LinkAuthorsBooks> linkAuthorsBooks = linkAuthBookService
					.getAuthorsBooks(id);
			model.addAttribute("linkAuthorsBooks", linkAuthorsBooks);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SaveCitationWeb_AuthorView";
	}

	@RequestMapping(value = "savecitation_authors", method = {
			RequestMethod.GET, RequestMethod.POST })
	public ModelAndView allAuthors() throws SQLException {
		ModelAndView modelView = new ModelAndView();
		List<Authors> allAuthors = authorService.getAllAuthors();
		modelView.addObject("allAuthors", allAuthors);
		modelView.setViewName("SaveCitationWeb_AllAuthors");
		return modelView;
	}

	@RequestMapping(value = "savecitation_books", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView allBooks() throws SQLException {
		ModelAndView modelView = new ModelAndView();
		List<Books> allBooks = booksService.getAllBooks();
		modelView.addObject("allBooks", allBooks);
		modelView.setViewName("SaveCitationWeb_AllBooks");
		return modelView;
	}

	@ModelAttribute("genre")
	public Genre genre() {
		return new Genre();
	}
	
	@ModelAttribute("authors")
	public Authors authors(){
		return new Authors();
	}

	@ModelAttribute("books")
	public Books books() {
		return new Books();
	}

	@ModelAttribute("booksCom")
	public BooksComments booksCom() {
		return new BooksComments();
	}

	private void assigmentGenreBooks(long id) throws SQLException {
		LinkGenreBooks linkGenreBooks = new LinkGenreBooks();

		List<Books> allBooks = booksService.getAllBooks();

		linkGenreBooks.setGenre(genreService.getGenreById(id));

		linkGenreBooks.setBooks(booksService.getBooksById(allBooks.size()));

		linkGenreBooksService.addGenreBooks(linkGenreBooks);
	}

	private void assigmentBooksCom(long id) throws SQLException {

		LinkBooksComments linkBooksCom = new LinkBooksComments();

		List<BooksComments> allBooksCom = booksComService.booksComments();

		linkBooksCom.setBooks(booksService.getBooksById(id));

		linkBooksCom.setBooksCom(booksComService.getCommentsById(allBooksCom
				.size()));

		linkBooksComService.addBooksCom(linkBooksCom);

	}

	private void assigmentAuthBooks(long id) throws SQLException {
		LinkAuthorsBooks linkAuthBooks = new LinkAuthorsBooks();
		
		List<Books> booksList = booksService.getAllBooks();
		
		linkAuthBooks.setBooks(booksService.getBooksById(booksList.size()));
		
		linkAuthBooks.setAuthors(authorService.getAuthor(id));
		
		linkAuthBookService.addAuthorsBooks(linkAuthBooks);
	}

}
