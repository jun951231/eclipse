package shop.cofin.oracle.publishers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.PublisherMapper;
import shop.cofin.oracle.publishers.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService{

	@Autowired PublisherMapper publisherMapper;
	
	@Override
	public List<PublisherDto> findAll() {
		// TODO Auto-generated method stub
		return publisherMapper.findAll();
	}

	@Override
	public PublisherDto findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return publisherMapper.findByPubId(pubId);
	}

	@Override
	public List<PublisherDto> findByPubName(String pubName) {
		// TODO Auto-generated method stub
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDto> findByMarName(String marName) {
		// TODO Auto-generated method stub
		return publisherMapper.findByMarName(marName);
	}

	@Override
	public List<PublisherDto> findByPhone(int phone) {
		// TODO Auto-generated method stub
		return publisherMapper.findByPhone(phone);
	}

}
