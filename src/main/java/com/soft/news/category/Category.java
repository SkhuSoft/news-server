package com.soft.news.category;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Category  implements Serializable  {
	@Id
	@GeneratedValue
	@Column(name="cate_id")
	private int cateId;
	private String name;
	private Timestamp created;
	private Timestamp updated;
}
