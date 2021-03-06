package by.ansgar.weblib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	/*
	 * index.jsp
	 */
	@RequestMapping(value = "/savecitation", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView turnUpMainPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb");
		return modelView;
	}

	/*
	 * CHAT BLOCK
	 */
	@RequestMapping(value = "/savecitation_chat", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView turnUpChatPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Chat");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_reg", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView turnUpRegPage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_Reg");
		return modelView;
	}

	@RequestMapping(value = "/savecitation_rule", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ModelAndView turnUpRulePage() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("SaveCitationWeb_rule");
		return modelView;
	}

}
