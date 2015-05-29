package by.ansgar.SaveCitationWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	@RequestMapping(value = "/savecitation", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView mainPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_news.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView newsPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_News");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_lib.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView libPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Library");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_chat.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView chatPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Chat");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_programs.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView progPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Program");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_viewnews.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView newsViewPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_NewsView");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_reg.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView regPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Reg");
		return modelView;
	}
	
	@RequestMapping(value = "/savecitation_rule.by", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView rulePage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_rule");
		return modelView;
	}
	
}
