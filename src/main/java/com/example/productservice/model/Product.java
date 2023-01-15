package com.example.productservice.model;
import java.math.BigDecimal;

//import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor ;
//import lombok.Builder ;
//import lombok.Data ;
//import lombok.NoArgsConstructor ;

//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	public Product(String id, String name, String description, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}
