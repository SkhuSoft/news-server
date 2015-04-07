package com.soft.news.test;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.news.category.Category;

public interface TestRepository extends JpaRepository<Test, Long>{

}
