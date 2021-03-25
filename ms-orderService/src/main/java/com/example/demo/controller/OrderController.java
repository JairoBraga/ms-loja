package com.example.demo.controller;

import java.util.List;

import com.example.demo.Dto.OrderedItemDTO;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderItem;
import com.example.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProductDTO;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping(value = "/v1/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/generate")
	public ResponseEntity<Order> criarPedido(@RequestBody List<OrderedItemDTO> orderedItem) {
		Order response = orderService.gerarPedido(orderedItem);
		return ResponseEntity.ok().body(response);
	}
}
