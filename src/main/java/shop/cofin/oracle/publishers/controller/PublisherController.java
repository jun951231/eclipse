package shop.cofin.oracle.publishers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.publishers.domain.PublisherDto;
import shop.cofin.oracle.publishers.service.PublisherService;

@Controller
public class PublisherController {
	@Autowired PublisherService publisherService;
	
	@RequestMapping("/publisher")
	public void findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}
	@RequestMapping("/publisher/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		PublisherDto publishers = publisherService.findByPubId(pubId);
			System.out.println(publishers.toString());
		
	}
	@RequestMapping("/publisher/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
			System.out.println(publishers.toString());
		
	}
	@RequestMapping("/publisher/marName/{marName}")
	public void findByMarName(@PathVariable String marName) {
		List<PublisherDto> publishers = publisherService.findByMarName(marName);
			System.out.println(publishers.toString());
		
	}
	@RequestMapping("/publisher/phone/{phone}")
	public void findByPhone(@PathVariable int phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
			System.out.println(publishers.toString());
		
	}
	
}
