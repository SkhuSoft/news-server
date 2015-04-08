package com.soft.news.article;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	private ArticleRepository articleRepository;
	
	@RequestMapping("/")
	public List<Article> list(@RequestParam int cateId){
		return articleRepository.findByCateId(cateId);
	}
	
	@RequestMapping("/get")
	public String get(){
		return "test";
	}

}
