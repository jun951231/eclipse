package shop.cofin.oracle.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper mapper;

	@Override
	public void save(BookDto book) {
		mapper.save(book);
	}

	@Override
	public BookDto findById(Integer bookId) {
		return mapper.findById(bookId);
	}

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public void update(BookDto book) {
		mapper.update(book);
		
	}

	@Override
	public void delete(Integer bookId) {
		mapper.delete(bookId);
	}

	@Override
	public List<BookDto> findByBookTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByPrice(String price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByPubId(String pubId) {
		// TODO Auto-generated method stub
		return null;
	}

}

