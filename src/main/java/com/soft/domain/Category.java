package com.soft.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Category {
	private int cateId;
	private String name;
	private Timestamp created;
	private Timestamp updated;
}
