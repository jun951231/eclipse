package shop.cofin.oracle.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("marName") String marName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId :" +pubId);
		System.out.println("pubName :" +pubName);
		System.out.println("marName :" +marName);
		System.out.println("phone :" +phone);
		publisher = new PublisherDto();
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMarName(marName);
		publisher.setPhone(phone);
		publisherService.save(publisher);
		return "/publisher/Login";
	}
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login() {
		return "Login";
	}
			
}			
			
	

