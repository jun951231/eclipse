package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	public List<OrderDto> findAll();
	public OrderDto findById(int orderId);
	void save(OrderDto order);
	void update(OrderDto order);
	void delete(int orderId);
	
	public OrderDto findByCustId(String Id);
	public OrderDto findByBooktId(String Id);
	public OrderDto findByPrice(String price);
	public OrderDto findByDate(String date);

}
