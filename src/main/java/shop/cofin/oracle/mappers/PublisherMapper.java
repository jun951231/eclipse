package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{
	public List<PublisherDto> findAll();
	public PublisherDto findById(int pubId);
	void save(PublisherDto publisherDto);
	void update(PublisherDto publisherDto);
	void delete(int pubId);
	
	public PublisherDto findByPubName(String name);
	public PublisherDto findByMarName(String name);
	public PublisherDto findByPhone(String phone);

}
