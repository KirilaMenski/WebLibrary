package by.ansgar.weblib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/enter_account", method = { RequestMethod.GET,
			RequestMethod.POST })
	@ResponseBody
	public Response entAccount(@RequestParam String name, @RequestParam int pass) {
		System.out.println("Прыйшоў сюды");
		Response result = new Response();

		if (name != null) {
			System.out.println("зайшоў у блок if");
			result.setUserName(name);
			result.setUserPassword(pass);
		}
		System.out.println("выйшаў з блоку");
		return result;

	}

}
