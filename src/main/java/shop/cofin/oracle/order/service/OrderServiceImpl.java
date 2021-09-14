package shop.cofin.oracle.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.OrderMapper;
import shop.cofin.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper mapper;

	@Override
	public void save(OrderDto order) {
		mapper.save(order);
	}
	
	

}
