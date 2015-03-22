package com.soft.domain;

import java.util.Date;

import lombok.Data;


@Data
public class NaverRss {

	private String title;
	private String link;
	private String description;
	private Date lastBuildDate;
	private int total;
	private int start;
	private int display;
	
	
	
	@Data
	public class Item {
		private String title;
		private String originallink;
		private String link;
		private String description;
		private Date pubDate;
	}
}
