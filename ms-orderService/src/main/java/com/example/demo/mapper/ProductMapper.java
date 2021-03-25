package com.example.demo.mapper;

import com.example.demo.Dto.ProductDTO;
import com.example.demo.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "name", source = "id")
    ProductDTO toDTO(Product product);

    Product toModel(ProductDTO Product);
}
