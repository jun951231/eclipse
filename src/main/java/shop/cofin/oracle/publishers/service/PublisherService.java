package shop.cofin.oracle.publishers.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.publishers.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public PublisherDto findByPubId(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMarName(String marName);
	public List<PublisherDto> findByPhone(int phone);

}
