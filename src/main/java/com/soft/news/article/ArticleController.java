package com.soft.news.article;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@RequestMapping("/")
	public String list(){
		return "test";
	}
	
	@RequestMapping("/get")
	public String get(){
		return "test";
	}

}
