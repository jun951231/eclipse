package shop.cofin.oracle.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate){
		System.out.println("orderId :" +orderId);
		System.out.println("custId :" +custId);
		System.out.println("bookId :" +bookId);
		System.out.println("orderPrice :" +orderPrice);
		System.out.println("orderDate :" +orderDate);
		order = new OrderDto();
		order.setOrderId(orderId);
		order.setCustId(custId);
		order.setBookId(bookId);
		order.setorderPrice(orderPrice);
		order.setorderDate(orderDate);
		orderService.save(order);
		
		return "/order/Login";
		}
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login() {
		return "Login";
	}
	
}
