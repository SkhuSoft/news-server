package com.soft.news.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.news.category.CategoryRepository;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestRepository testRepository;

	@RequestMapping("/")
	public String list() {
		System.out.println("test:  " + testRepository.findAll());
		return "list";
	}

}
