package shop.cofin.oracle.customer.service;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService {
	void save(CustomerDto customer);
}
