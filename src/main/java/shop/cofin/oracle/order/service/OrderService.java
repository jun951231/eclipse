package shop.cofin.oracle.order.service;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.order.domain.OrderDto;

@Component
public interface OrderService {
	void save(OrderDto order);


}
