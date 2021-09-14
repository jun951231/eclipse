package shop.cofin.oracle.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper mapper;
	
	@Override
	public void save(BookDto book) {
		mapper.save(book);
	}
}

