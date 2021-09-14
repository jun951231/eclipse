package shop.cofin.oracle.publisher.service;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	void save(PublisherDto publisher);

}
