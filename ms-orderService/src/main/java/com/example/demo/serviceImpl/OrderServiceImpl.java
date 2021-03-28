package com.example.demo.serviceImpl;

import com.example.demo.Dto.OrderedItemDTO;
import com.example.demo.Dto.ProductDTO;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderItem;
import com.example.demo.feign.ProductFeignClient;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Service
public class OrderServiceImpl implements OrderService{
	
	@Value("${urlWebServiceProduct}")
	private String urlWebServiceProduct;

	@Autowired
	ProductMapper productMapper = ProductMapper.INSTANCE;

	@Autowired
	private OrderRepository repository;

	@Autowired
	private ProductFeignClient productFeignClient;
	
	@Override
	public Order gerarPedido(List<OrderedItemDTO> orderedItem) {

		ResponseEntity<List<ProductDTO>> response = productFeignClient.listarProdutosPorFiltro(orderedItem);
		List<OrderItem> orderItemsList = new ArrayList<>();

		orderedItem.stream().forEach(order -> orderItemsList.add(new OrderItem(null,order.getProductName(),null,order.getQuantity(),null)));

		for(OrderItem item: orderItemsList){
			for(ProductDTO itemDTO: response.getBody()){
				if(itemDTO.getName().equals(item.getName())){
					item.setPrice(itemDTO.getPrice());
					item.setProduct_id(itemDTO.getId());
				}
			}
		}
		Order order = new Order(null, LocalDateTime.now(),orderItemsList);
		repository.save(order);
		return order;
	}
	

}
