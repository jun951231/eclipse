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
	public void save(BookDto book) {
		// TODO Auto-generated method stub
		mapper.save(book);
	}

	@Override
	public BookDto findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public void update(BookDto book) {
		// TODO Auto-generated method stub
		mapper.update(book);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}

	@Override
	public List<BookDto> findByBookTitle(String title) {
		// TODO Auto-generated method stub
		return mapper.findByBookTitle(title);
	}

	@Override
	public List<BookDto> findByPrice(int price) {
		// TODO Auto-generated method stub
		return mapper.findByPrice(price);
	}

	@Override
	public List<BookDto> findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return mapper.findByPubId(pubId);
	}

	
	
	
	
}

