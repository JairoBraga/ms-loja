package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository service;
	
	@Override
	public List<Product> buscarTodosProdutos() {
		return service.findAll();
	}

	@Override
	public List<Product> buscarProdutos(List<ProductDTO> products) {
		List<Product> response = new ArrayList<>();
		for(var prod: products){
			response.add(service.findById(prod.getId()).get());
		}
		return response;
	}
}
