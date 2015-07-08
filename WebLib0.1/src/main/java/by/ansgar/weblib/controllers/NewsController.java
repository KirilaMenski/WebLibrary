package by.ansgar.weblib.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
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

import by.ansgar.weblib.entity.LinkNewsCom;
import by.ansgar.weblib.entity.News;
import by.ansgar.weblib.entity.NewsComments;
import by.ansgar.weblib.service.LinkNewsComService;
import by.ansgar.weblib.service.NewsCommentsService;
import by.ansgar.weblib.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;
	@Autowired
	private NewsCommentsService newsComService;
	@Autowired
	private LinkNewsComService linkNewsComService;

	private long newsId;

	/*
	 * NEWSLIST BLOCK
	 */
	@RequestMapping(value = "/savecitation_news", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView newsPage() throws SQLException {
		ModelAndView modelView = new ModelAndView();

		List<News> allNews = newsService.getAllNews();
		List<News> newsList = new ArrayList<News>();
		for(int i = allNews.size() - 1; i>=0; i--){
			News news = allNews.get(i);
			newsList.add(news);
		}
//		modelView.addObject("news", allNews);
		modelView.addObject("news", newsList);

		modelView.setViewName("SaveCitationWeb_News");
		return modelView;
	}

	/*
	 * VIEW NEWS BY ID BLOCK
	 */
	@RequestMapping(value = "/savecitation_viewnews_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String newsViewPage(@PathVariable long id, Model model) {

		try {

			News news = newsService.getNewsById(id);
			model.addAttribute("news", news);
			newsId = id;
			List<LinkNewsCom> linkNewsCom = linkNewsComService
					.getAllComent(id);
			System.out.println(linkNewsCom);
			model.addAttribute("linkNewsCom", linkNewsCom);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_NewsView";
	}

	@RequestMapping(value = "/addNewsComment", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String addNewsComment(@ModelAttribute NewsComments newsComments,
			BindingResult result) {
		try {
			newsComService.addComments(newsComments);
			assigmentNewsComments(newsId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/savecitation_news";
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
				return "forward:/savecitation_editNewsPage_{id}";
			case "Delete":
				news.setId(id);
				newsService.deleteNews(news);
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
			news = newsService.getNewsById(newsId);
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
			newsService.editNews(news);
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
			newsService.addNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "forward:/savecitation_news";
	}

	@ModelAttribute("news")
	public News news() {
		return new News();
	}

	@ModelAttribute("newsComments")
	public NewsComments newsComments() {
		return new NewsComments();
	}

	private void assigmentNewsComments(long id) throws SQLException {
		LinkNewsCom newsCom = new LinkNewsCom();

		List<NewsComments> allComments = newsComService.commentsList();

		newsCom.setNews(newsService.getNewsById(id));

		newsCom.setNewsCom(newsComService.getCommentById(allComments.size()));

		linkNewsComService.addNewsCom(newsCom);
	}

}
