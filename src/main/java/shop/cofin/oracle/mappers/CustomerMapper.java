package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	public List<CustomerDto> findByName(String name);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(int phone);

}
