package com.soft.news.test;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="test_db")
public class Test {
	public String name;
	public String text;
	public int num;
}
