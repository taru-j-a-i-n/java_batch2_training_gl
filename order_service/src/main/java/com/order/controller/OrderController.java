package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/product/{productId}")
	public List<Order> getOrder(@PathVariable("productId") int productId) {
		return this.orderService.getOrderOfProduct(productId);
	}

}
