package shop.cofin.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper mapper;

	@Override
	public void save(BookDto t) {
		mapper.save(t);
	}

	@Override
	public BookDto findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public List<BookDto> findAll() {
		return mapper.findAll();
	}

	@Override
	public void update(BookDto t) {
		mapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
	}

	
	
	
}

