package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping(value = "/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping()
	public ResponseEntity<List<Product>> listarProdutos(){
		List<Product> listaDeProdutos = service.buscarTodosProdutos();
		return ResponseEntity.ok().body(listaDeProdutos);
	}
	
	@PostMapping(value = "/search")
	public ResponseEntity<List<Product>> listarProdutosPorFiltro(@RequestBody List<ProductDTO> products){
		List<Product> listaResponse = service.buscarProdutos(products);
		
		return ResponseEntity.ok().body(listaResponse);
		
	}
}
