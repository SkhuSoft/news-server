package com.soft.news.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.soft.domain.Category;

@Component("categoryRepository")
public class CategoryRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Category findCategory(int id){
		Category category = jdbcTemplate.<Category>queryForObject("select cate_id cateId, name, created, updated from category", Category.class);
		return category;
	}
	
}
