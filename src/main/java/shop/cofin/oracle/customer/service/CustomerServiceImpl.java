package shop.cofin.oracle.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto customer) {
		mapper.save(customer);
	}

}
