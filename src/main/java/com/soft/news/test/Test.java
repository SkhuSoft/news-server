package com.soft.news.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="test_db")
public class Test implements Serializable {
	@Id
	public String name;
	public String text;
	public int num;
}
