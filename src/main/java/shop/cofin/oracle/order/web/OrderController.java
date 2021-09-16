package shop.cofin.oracle.order.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.order.model.OrderDto;
import shop.cofin.oracle.order.model.OrderService;


@Controller
@RequestMapping("/orders")
public class OrderController{
	
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String save(OrderDto order) {
		// TODO Auto-generated method stub
		return "주문 등록";
	}
	
	@RequestMapping("/detail")
	public String findById(@RequestBody Integer id) {
		System.out.println(orderService.findById(id).toString());
		return "오더 아이디로 찾기";
	}
	
	@RequestMapping("/list")
	public String findAll(){
		List<OrderDto> list = orderService.findAll();
		for(OrderDto order : list) {
			System.out.println(order.toString());
		}
		return "전체 주문 내역";
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(OrderDto order) {
		orderService.update(order);
		return "주문 수정";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("orderId") Integer orderId) {
		orderService.delete(orderId);
		return "주문 취소";
	}
	@RequestMapping("/custId")
	public void findByCustId(@RequestParam int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/bookId")
	public void findByBooktId(@RequestParam int bookId) {
		List<OrderDto> orders = orderService.findByBooktId(bookId);
		for(OrderDto order : orders)
			System.out.println(order.toString());
	}
	@RequestMapping("/price")
	public void findByPrice(@RequestParam int price) {
		List<OrderDto> orders = orderService.findByPrice(price);
		for(OrderDto order : orders)
			System.out.println(order.toString());
	}
	@RequestMapping("/date")
	public void findByDate(@RequestParam String date) {
		List<OrderDto> orders = orderService.findByDate(date);
		for(OrderDto order : orders)
			System.out.println(order.toString());
	}

	
}
