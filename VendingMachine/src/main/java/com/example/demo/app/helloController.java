package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class helloController {

	
		@GetMapping("/hello")
		public String hello(Model model) {
			model.addAttribute("title", "Inquiry Form");
			return "hello/hello";
		}

}

