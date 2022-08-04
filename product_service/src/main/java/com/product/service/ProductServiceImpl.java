package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	// fake product list
	List<Product> list =List.of(
			new Product(11, "Product 1","Code 1"),
			new Product(12, "Product 2","Code 2"),
			new Product(13, "Product 3","Code 3")
			);
	
	@Override
	public Product getProduct(int id) {
		return this.list.stream().filter(product -> product.getpId() == (id)).findAny().orElse(null);
	}

}
