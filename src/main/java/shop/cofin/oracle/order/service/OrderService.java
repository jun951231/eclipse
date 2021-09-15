package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;
import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDto;

@Component
public interface OrderService extends GenericInterface<OrderDto, Integer>{
	
	public List<OrderDto> findByCustId(int Id);
	public List<OrderDto> findByBooktId(int Id);
	public List<OrderDto> findByPrice(int price);
	public List<OrderDto> findByDate(String date);

}
