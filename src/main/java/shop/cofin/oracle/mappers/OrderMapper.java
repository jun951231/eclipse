package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;


import shop.cofin.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	public List<OrderDto> findAll();
	public OrderDto findByOrderId(int orderId);
	public OrderDto findByCustId(int custId);
	public OrderDto findByBookId(int bookId);
	public List<OrderDto> findByPrice(int price);
	public List<OrderDto> findByDate(int date);

}
