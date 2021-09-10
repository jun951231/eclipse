package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired CustomerService customerService;
	
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}

	@RequestMapping("/customers/custId/{custId}")
	public void findById(@PathVariable int custId) {
		CustomerDto customers = customerService.findById(custId);
			System.out.println(customers.toString());
	}
	
	@RequestMapping("/customers/custName/{custName}")
	public void findByName(@PathVariable String custName) {
		List<CustomerDto> customers = customerService.findByName(custName);
			System.out.println(customers.toString());
	}
	@RequestMapping("/customers/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDto> customers = customerService.findByAddress(address);
			System.out.println(customers.toString());
	}
	@RequestMapping("/customers/phone/{phone}")
	public void findByPhone(@PathVariable int phone) {
		List<CustomerDto> customers = customerService.findByPhone(phone);
			System.out.println(customers.toString());
	}
}

