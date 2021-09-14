package shop.cofin.oracle.customer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;


@Controller
public class CustomerController implements GenericInterface<CustomerDto, Integer>{
	@Autowired CustomerService customerService;
	
	@RequestMapping("/save")
	public void save(CustomerDto t) {
		customerService.save(t);
}

	@RequestMapping("/find/{id}")
	public CustomerDto findById(Integer id) {
		return customerService.findById(id);
	}

	@RequestMapping("/list")
	public List<CustomerDto> findAll() {
		return customerService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(CustomerDto t) {
		customerService.update(t);		
	}

	@RequestMapping(value = "/delet/{id}", method = RequestMethod.PUT)
	public void delete(Integer id) {
		customerService.delete(id);		
	}

}