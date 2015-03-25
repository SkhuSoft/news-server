package com.soft.domain;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class Article {
	private int artId;
	private int cateId;
	private String name;
	private String subject;
	private String url;
	private String content;
	private Timestamp created;
	private Timestamp updated;
}
