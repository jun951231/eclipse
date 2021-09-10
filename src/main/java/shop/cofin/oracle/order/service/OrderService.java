package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.order.domain.OrderDto;

@Component
public interface OrderService {
	public List<OrderDto> findAll();
	public OrderDto findByOrderId(int orderId);
	public OrderDto findByCustId(int custId);
	public OrderDto findByBookId(int bookId);
	public List<OrderDto> findByPrice(int price);
	public List<OrderDto> findByDate(int date);


}
