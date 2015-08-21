package by.ansgar.weblib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
//	Response result = new Response();

	@RequestMapping(value = "/enter_account", method = { RequestMethod.GET,
			RequestMethod.POST })
	public @ResponseBody
	String signIn(@RequestParam String name, @RequestParam int pass) {
		System.out.println("Прыйшоў сюды");

		if (name != null) {
			System.out.println("зайшоў у блок if");
//			result.setUserName(name);
//			result.setUserPassword(pass);
			System.out.println(name + "||" + pass);
		}
		
		String result = "Hello, " + name + "!";
		System.out.println("выйшаў з блоку");
		return result;

	}

}
