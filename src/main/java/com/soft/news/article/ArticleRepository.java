package com.soft.news.article;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	List<Article> findByCateId(int cateId);
}
