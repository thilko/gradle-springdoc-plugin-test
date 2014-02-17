package com.thilko.springdoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Test> test(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return new ResponseEntity<Test>(new Test(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView test1(ModelMap model) {
        return null;
    }


}