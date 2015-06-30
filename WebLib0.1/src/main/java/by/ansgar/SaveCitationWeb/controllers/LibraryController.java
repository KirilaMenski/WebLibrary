package by.ansgar.SaveCitationWeb.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.ansgar.SaveCitationWeb.entity.Books;
import by.ansgar.SaveCitationWeb.entity.Genre;
import by.ansgar.SaveCitationWeb.entity.LinkGenreBooks;
import by.ansgar.SaveCitationWeb.service.BooksService;
import by.ansgar.SaveCitationWeb.service.GenreService;
import by.ansgar.SaveCitationWeb.service.LinkGenreBooksService;

@Controller
public class LibraryController {

	@Autowired
	private GenreService genreService;
	@Autowired
	private BooksService booksService;
	@Autowired
	private LinkGenreBooksService linkGenreBooksService;

	private long genreId;
	private long booksId;

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
			booksService.addBooks(books);
			assigmentGenreBooks(genreId);
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
			model.addAttribute("books", books);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "SaveCitationWeb_ViewBook";
	}

	@ModelAttribute("genre")
	public Genre genre() {
		return new Genre();
	}

	@ModelAttribute("books")
	public Books books() {
		return new Books();
	}

	private void assigmentGenreBooks(long id) throws SQLException {
		LinkGenreBooks linkGenreBooks = new LinkGenreBooks();

		List<Books> allBooks = booksService.getAllBooks();

		linkGenreBooks.setGenre(genreService.getGenreById(id));

		linkGenreBooks.setBooks(booksService.getBooksById(allBooks.size()));

		linkGenreBooksService.addGenreBooks(linkGenreBooks);
		System.out.println(id);
	}

}
