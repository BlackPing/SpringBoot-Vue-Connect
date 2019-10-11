package com.blackping.BootExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VueController {

	@GetMapping(value = "/*")
	public String root() {
		System.out.println("test");
		return "index";
	}
}