package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller

public class PublisherController{
	@Autowired PublisherService publisherService;

	@RequestMapping("/save")
	public void save(PublisherDto t) {
		publisherService.save(t);
		
	}

	@RequestMapping("/find/{id}")
	public PublisherDto findById(Integer id) {
		return publisherService.findById(id);
	}

	@RequestMapping("/list")
	public List<PublisherDto> findAll() {
		return publisherService.findAll();
	}

	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public void update(PublisherDto t) {
		publisherService.update(t);
		
	}

	@RequestMapping(value="/delet/{id}", method = RequestMethod.DELETE)
	public void delete(Integer id) {
		publisherService.delete(id);
		
	}
		
}			
			
	

