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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.ansgar.SaveCitationWeb.entity.News;
import by.ansgar.SaveCitationWeb.service.NewsService;

@Controller
public class Controllers {

	@Autowired
	// @Qualifier("service")
	private NewsService service;

	private long newsId;

	/*
	 * index.jsp
	 */
	@RequestMapping(value = "/savecitation", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView mainPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb");
		return modelView;
	}

	/*
	 * NEWSLIST BLOCK
	 */
	@RequestMapping(value = "/savecitation_news", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView newsPage() throws SQLException {
		ModelAndView modelView = new ModelAndView();

		List<News> allNews = service.getAllNews();
		modelView.addObject("news", allNews);

		modelView.setViewName("SaveCitationWeb_News");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_lib", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView libPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Library");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_chat", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView chatPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Chat");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_programs", method = {
			RequestMethod.GET, RequestMethod.POST })
	public ModelAndView progPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Program");
		return modelView;
	}

	/*
	 * VIEW NEWS BY ID BLOCK
	 */
	@RequestMapping(value = "/savecitation_viewnews_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String newsViewPage(@PathVariable long id, Model model) {

		try {

			News news = service.getNewsById(id);
			model.addAttribute("news", news);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_NewsView";
	}

	/*
	 * DELETE NEWS BLOCK
	 */
	@RequestMapping(value = "/savecitation_deleteNews_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String deleteNews(@ModelAttribute News news, @PathVariable long id,
			@RequestParam(value = "action", required = true) String action) {

		try {
			switch (action) {
			case "Edit":
				System.out.println(id);
				newsId = id;
				return "forward:/savecitation_editNewsPage_{id}";
			case "Delete":
				news.setId(id);
				service.deleteNews(news);
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_news";
	}

	/*
	 * EDIT BLOCK
	 */
	@RequestMapping(value = "/savecitation_editNewsPage_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String editNewsPage(Model model) {

		try {
			News news = new News();
			news = service.getNewsById(newsId);
			model.addAttribute("news", news);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_EditNews";
	}

	@RequestMapping(value = "/savecitation_editNews_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String editNews(@ModelAttribute News news, Model model) {

		try {
			news.setId(newsId);
			service.editNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_news";
	}

	/*
	 * ADD NEWS BLOCK
	 */
	@RequestMapping(value = "/addNewsPage", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView addNewsPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_AddNews");
		return modelView;
	}

	@RequestMapping(value = "/addNews", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addNews(@ModelAttribute News news, BindingResult results) {

		try {
			service.addNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_news";
	}

	@RequestMapping(value = "/savecitation_reg", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView regPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Reg");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_rule", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView rulePage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_rule");
		return modelView;
	}

	@ModelAttribute("news")
	public News pupulateNews() {
		return new News();
	}

}
