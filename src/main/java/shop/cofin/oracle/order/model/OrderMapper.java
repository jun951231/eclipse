package shop.cofin.oracle.order.model;


import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	
	public List<OrderDto> findByCustId(int Id);
	public List<OrderDto> findByBooktId(int Id);
	public List<OrderDto> findByPrice(int price);
	public List<OrderDto> findByDate(String date);

}
