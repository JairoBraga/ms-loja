package com.example.demo.service;

import com.example.demo.Dto.OrderedItemDTO;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderItem;

import java.util.List;

public interface OrderService {

	public Order gerarPedido(List<OrderedItemDTO> ordererItem);
}

