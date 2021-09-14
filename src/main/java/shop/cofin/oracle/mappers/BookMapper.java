package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.common.GenericInterface;


@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	void save(BookDto book);
	void update(BookDto book);
	void dele(int bookId);
		
	public BookDto findByBookTitle(String title);
	public BookDto findByPrice(String price);
	public BookDto findByPubId (String id);
}
