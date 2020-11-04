package com.ust.springangular.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	public int id;
	public int  prodid;
	public String category;
	public String type;
	public LocalDate expirydate;
	
	
	public Product(int id,int prodid,String category, String type, LocalDate expirydate) {
		super();
		this.id = id;
		this.prodid=prodid;
		this.category = category;
		this.type = type;
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodid=" + prodid + ", category=" + category + ", type=" + type
				+ ", expirydate=" + expirydate + "]";
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getExpirydate() {
		return expirydate;
	}
	public Product() {
		super();
	}
	public void setExpirydate(LocalDate expirydate) {
		this.expirydate = expirydate;
	}


}
