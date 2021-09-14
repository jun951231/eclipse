package shop.cofin.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer>{
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	void save(CustomerDto customer);
	void update(CustomerDto customer);
	void delete(int custId);
	
	public CustomerDto findByName(String name);
	public CustomerDto findByAddress(String address);
	public CustomerDto findByPhone(String phone);

}
