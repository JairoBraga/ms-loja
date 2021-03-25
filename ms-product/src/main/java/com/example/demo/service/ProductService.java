package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.entities.Product;

@Service
public interface ProductService {
	
	public List<Product> buscarTodosProdutos();
	
	public List<Product> buscarProdutos(List<ProductDTO> products);

}
