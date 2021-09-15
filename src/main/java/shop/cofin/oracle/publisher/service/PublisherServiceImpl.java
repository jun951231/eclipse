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
			// TODO Auto-generated method stub
			mapper.save(t);
		}

		@Override
		public PublisherDto findById(Integer id) {
			// TODO Auto-generated method stub
			return mapper.findById(id);
		}

		@Override
		public List<PublisherDto> findAll() {
			// TODO Auto-generated method stub
			return mapper.findAll();
		}

		@Override
		public void update(PublisherDto t) {
			// TODO Auto-generated method stub
			mapper.update(t);
		}

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
			mapper.delete(id);
		}

		@Override
		public List<PublisherDto> findByPubName(String pubName) {
			// TODO Auto-generated method stub
			return mapper.findByPubName(pubName);
		}

		@Override
		public List<PublisherDto> findByMarName(String marName) {
			// TODO Auto-generated method stub
			return mapper.findByMarName(marName);
		}

		@Override
		public List<PublisherDto> findByPhone(String phone) {
			// TODO Auto-generated method stub
			return mapper.findByPhone(phone);
		}

}
