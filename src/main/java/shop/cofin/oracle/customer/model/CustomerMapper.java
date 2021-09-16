package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	List<CustomerDto> findByCustName(String custName);
	List<CustomerDto> findByAddress(String address);
	List<CustomerDto> findByPhone(String phone);

}
