package com.example.demo.Dto;

import com.example.demo.entities.Category;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class ProductDTO{
	
	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value = "price")
	private Double price;

	@JsonProperty(value = "quantidade")
	private Integer quantidade;

	@JsonProperty(value = "categories")
	private Set<Category> categories;

	public ProductDTO() {}

	public ProductDTO(Long id, String name, Double price, Set<Category> categories, Integer quantidade) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.categories = categories;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
