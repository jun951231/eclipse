package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	void save(CustomerDto customer);
	void update(CustomerDto customer);
	void delete(int custId);
	
	public CustomerDto findByName(String name);
	public CustomerDto findByAddress(String address);
	public CustomerDto findByPhone(String phone);

}
