package shop.cofin.oracle.publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.PublisherMapper;
import shop.cofin.oracle.publisher.domain.PublisherDto;


@Service
public class PublisherServiceImpl implements PublisherService{

		@Autowired PublisherMapper mapper;

		@Override
		public void save(PublisherDto t) {
			mapper.save(t);			
		}

		@Override
		public PublisherDto findById(Integer id) {
			return mapper.findById(id);
		}

		@Override
		public List<PublisherDto> findAll() {
			return mapper.findAll();
		}

		@Override
		public void update(PublisherDto t) {
			mapper.update(t);			
		}

		@Override
		public void delete(Integer id) {
			mapper.delete(id);
		}
		
		
}
