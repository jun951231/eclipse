package shop.cofin.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public CustomerDto findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
		
	}

	@Override
	public List<CustomerDto> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public CustomerDto findById(int custId) {
		// TODO Auto-generated method stub
		return mapper.findById(custId);
	}

	@Override
	public void save(CustomerDto customer) {
		// TODO Auto-generated method stub
		mapper.save(customer);
	}

	@Override
	public void update(CustomerDto customer) {
		// TODO Auto-generated method stub
		mapper.update(customer);
	}

	@Override
	public void delete(int custId) {
		// TODO Auto-generated method stub
		mapper.delete(custId);
	}

	@Override
	public CustomerDto findByName(String name) {
		// TODO Auto-generated method stub
		return mapper.findByName(name);
	}

	@Override
	public CustomerDto findByAddress(String address) {
		// TODO Auto-generated method stub
		return mapper.findByAddress(address);
	}

	@Override
	public CustomerDto findByPhone(String phone) {
		// TODO Auto-generated method stub
		return mapper.findByPhone(phone);
	}

		

}
