/**
 * 
 */
package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mms.loader.BackendLoader;

/**
 * @author Daddy
 *
 */
@Controller
public class MMSController {

//	@Autowired
//	private BackendLoader backendLoader;
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String helloWorld(@RequestParam(value="name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
	
}