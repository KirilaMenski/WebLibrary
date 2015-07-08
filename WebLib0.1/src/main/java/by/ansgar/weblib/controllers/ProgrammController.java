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

import by.ansgar.weblib.entity.News;
import by.ansgar.weblib.entity.Programm;
import by.ansgar.weblib.service.ProgrammService;

@Controller
public class ProgrammController {

	@Autowired
	private ProgrammService progService;

	@RequestMapping(value = "/savecitation_programs", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String progPage(Model model) {
		try {
			List<Programm> allProg = progService.getAllProgram();
			model.addAttribute("programm", allProg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SaveCitationWeb_Program";
	}

	@RequestMapping(value = "/savecitation_viewprog_{id}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String viewProg(@PathVariable long id, Model model) {
		try {
			Programm prog = progService.getProgrammById(id);
			model.addAttribute("prog", prog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "SaveCitationWeb_ViewProg";
	}

	@ModelAttribute("programm")
	public Programm programm() {
		return new Programm();
	}
}
