package com.soft.news.article;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Article {
	@Id
	@Column(name="art_id")
	private int artId;
	@Column(name="cate_id")
	private int cateId;
	
	private String name;
	private String subject;
	private String url;
	private String content;
	private Timestamp created;
	private Timestamp updated;
}
