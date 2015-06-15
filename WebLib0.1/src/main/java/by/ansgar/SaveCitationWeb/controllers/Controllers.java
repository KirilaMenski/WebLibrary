package by.ansgar.SaveCitationWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.ansgar.SaveCitationWeb.entity.News;
import by.ansgar.SaveCitationWeb.service.NewsService;

@Controller
public class Controllers {
	
	@Autowired
//	@Qualifier("service")
	private NewsService service;

	@RequestMapping(value = "/savecitation", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView mainPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_news", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView newsPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_News");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_lib", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView libPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Library");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_chat", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView chatPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Chat");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_programs", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView progPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Program");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_viewnews/{id}", method = {RequestMethod.GET, RequestMethod.POST})
	public String newsViewPage(@PathVariable int id, Model model) {
		
		try{
			News news = service.getNewsById(id);
			model.addAttribute("news", news);
			//modelView.setViewName("SaveCitationWeb_NewsView");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "SaveCitationWeb_NewsView";
	}
	
	@RequestMapping(value = "/addNewsPage", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView addNewsPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_AddNews");
		return modelView;
	}
	
	@RequestMapping(value = "/addNews", method = {RequestMethod.GET, RequestMethod.POST})
	public String addNews(@ModelAttribute News news, BindingResult results) {
		
		try{
			service.addNews(news);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "forward:/savecitation_news";
	}
	
	@RequestMapping(value = "/savecitation_reg", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView regPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Reg");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_rule", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView rulePage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_rule");
		return modelView;
	}
	
	@ModelAttribute("news")
	public News pupulateNews(){
		return new News();
	}
	
}
