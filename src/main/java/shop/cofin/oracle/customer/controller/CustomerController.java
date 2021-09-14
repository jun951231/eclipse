package shop.cofin.oracle.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})	
	public String join(
			@RequestParam("custId") String custId,
			@RequestParam("custName") String custName, 
			@RequestParam("address") String address,
			@RequestParam("phone") String phone) {
		
		System.out.println("custId: " + custId);
		System.out.println("custName: " + custName);
		System.out.println("address: " + address);
		System.out.println("phone: " + phone);
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setAddress(address);
		customer.setCustName(custName);
		customer.setPhone(phone);
		customerService.save(customer);
		
		return "/user/Login";
	}
	
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String lgin() {
		return "Login form";
	}
	
}

