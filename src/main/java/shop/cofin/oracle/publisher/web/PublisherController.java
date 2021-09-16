package shop.cofin.oracle.publisher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.publisher.model.PublisherDto;
import shop.cofin.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(PublisherDto t) {
		publisherService.save(t);
		return "출판사 등록";
	}
	
	@RequestMapping("/list")
	public String list() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
		return "출판사 목록";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(PublisherDto t) {
		publisherService.update(t);
		return "출판사 수정";		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("pubId") Integer pubId){
		publisherService.delete(pubId);
		return "출판사 삭제";		
	}
		
}			
			
	

