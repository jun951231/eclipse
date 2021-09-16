package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto t) {
		mapper.save(t);
	}

	@Override
	public CustomerDto findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		return mapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		mapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
	}

	@Override
	public List<CustomerDto> findByCustName(String custName) {
		return mapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDto> findByAddress(String address) {
		return mapper.findByAddress(address);
	}

	@Override
	public List<CustomerDto> findByPhone(String phone) {
		return mapper.findByPhone(phone);
	}
	
}
