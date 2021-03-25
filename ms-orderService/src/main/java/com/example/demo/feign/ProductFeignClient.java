package com.example.demo.feign;

import com.example.demo.Dto.ProductDTO;
import com.example.demo.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(name = "ms-product", url = "http://localhost:8080", path = "/v1/product")
public interface ProductFeignClient {
    @PostMapping(value = "/search")
    public ResponseEntity<List<ProductDTO>> listarProdutosPorFiltro(@RequestBody List<?> products);

    @GetMapping()
    public ResponseEntity<List<Product>> listarProdutos();
}
