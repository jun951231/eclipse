package shop.cofin.oracle.order.service;

import java.util.List;

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

	@Override
	public OrderDto findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public List<OrderDto> findAll() {
		return mapper.findAll();
	}

	@Override
	public void update(OrderDto t) {
		mapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
		
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		return mapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBooktId(int bookId) {
		// TODO Auto-generated method stub
		return mapper.findByBooktId(bookId);
	}

	@Override
	public List<OrderDto> findByPrice(int price) {
		// TODO Auto-generated method stub
		return mapper.findByPrice(price);
	}

	@Override
	public List<OrderDto> findByDate(String date) {
		// TODO Auto-generated method stub
		return mapper.findByDate(date);
	}

	

}
