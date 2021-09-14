package shop.cofin.oracle.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.PublisherMapper;
import shop.cofin.oracle.publisher.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService{

	@Autowired PublisherMapper mapper;
	
	@Override
	public void save(PublisherDto publisher) {
		mapper.save(publisher);
	}

}
