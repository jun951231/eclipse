package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.publishers.domain.PublisherDto;

@Repository
public interface PublisherMapper {
	public List<PublisherDto> findAll();
	public PublisherDto findByPubId(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMarName(String marName);
	public List<PublisherDto> findByPhone(int phone);

}
