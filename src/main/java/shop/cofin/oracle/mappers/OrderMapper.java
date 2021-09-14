package shop.cofin.oracle.mappers;

import org.springframework.stereotype.Repository;


import shop.cofin.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	
	void save(OrderDto order);

}
