package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.OrderMapper;
import shop.cofin.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public OrderDto findByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return orderMapper.findByOrderId(orderId);
	}

	@Override
	public OrderDto findByCustId(int custId) {
		// TODO Auto-generated method stub
		return orderMapper.findByCustId(custId);
	}

	@Override
	public OrderDto findByBookId(int bookId) {
		// TODO Auto-generated method stub
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDto> findByPrice(int price) {
		// TODO Auto-generated method stub
		return orderMapper.findByPrice(price);
	}

	@Override
	public List<OrderDto> findByDate(int date) {
		// TODO Auto-generated method stub
		return orderMapper.findByDate(date);
	}
	
	

}
