package shop.cofin.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
public class OrderController{
	
	@Autowired OrderService orderService;

	@RequestMapping("/save")
	public void save(OrderDto t) {
		orderService.save(t);
	}

	@RequestMapping("/find/{id}")
	public OrderDto findById(Integer id) {
		return orderService.findById(id);
	}

	@RequestMapping("/list")
	public List<OrderDto> findAll() {
		return orderService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(OrderDto t) {
		orderService.update(t);		
	}

	@RequestMapping(value = "/delet/{id}", method = RequestMethod.DELETE)
	public void delete(Integer id) {
		orderService.delete(id);		
	}
	
		
	
}
