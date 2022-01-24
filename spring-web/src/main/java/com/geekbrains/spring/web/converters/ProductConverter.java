package com.geekbrains.spring.web.converters;

import com.geekbrains.spring.web.dto.ProductDto;
import com.geekbrains.spring.web.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public Product dtoToEntity(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }

    public ProductDto entityToDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice(), product.getCategory().getTitle());
    }

    public com.geekbrains.spring.web.soap.Product entityToXmlType(Product entity) {
        com.geekbrains.spring.web.soap.Product product = new com.geekbrains.spring.web.soap.Product();
        product.setId(entity.getId());
        product.setTitle(entity.getTitle());
        product.setPrice(entity.getPrice());
        product.setCategory(entity.getCategory().getTitle());
        return product;
    }
}
