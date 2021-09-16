package shop.cofin.oracle.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.customer.model.CustomerDto;
import shop.cofin.oracle.customer.model.CustomerService;


@Controller
public class CustomerController{
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String save(CustomerDto t) {
		customerService.save(t);
		System.out.println("*****Save Complete : " + t.toString());
		return "redirect:/move/home/intro";	
	}
	@RequestMapping("/detail/custId")
	public String findById(@RequestParam("custId") int custId) {
		CustomerDto customer = customerService.findById(custId);
		System.out.println("*****Select Complete : " + customer.toString());
		return "redirect:/move/home/intro";			
	}
	@RequestMapping("/list/custName")
	public String findByCustName(@RequestParam String custName) {
		List<CustomerDto> list = customerService.findByCustName(custName);
		forPrint(list);
		return "redirect:/move/home/intro";	
	}
	public String forPrint(List<CustomerDto> list) {
		System.out.println("*****Select Complete : ");
		for(CustomerDto c : list) {
			System.out.println(c.toString());
		}
		return "redirect:/move/home/intro";	
	}
	@RequestMapping("/list/address")
	public String findByAddress(@RequestParam String address) {
		List<CustomerDto> list = customerService.findByAddress(address);
		forPrint(list);
		return "redirect:/move/home/intro";
	}
	@RequestMapping(value="/list/phone", method=RequestMethod.POST)
	public String findByPhone(@RequestParam String phone) {
		List<CustomerDto> list = customerService.findByPhone(phone);
		forPrint(list);
		return "redirect:/move/home/intro";

	}@RequestMapping("/list")
	public String findAll() {
		List<CustomerDto> list = customerService.findAll();
		forPrint(list);
		return "redirect:/move/home/intro";		
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(CustomerDto t) {
		customerService.update(t);
		System.out.println("*****Update Complete: " + t.toString());
		return "redirect:/move/home/intro";		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer custId) {
		customerService.delete(custId);
		System.out.println("*****Delete Complete: " + custId);
		return "redirect:/move/home/intro";
	}
}