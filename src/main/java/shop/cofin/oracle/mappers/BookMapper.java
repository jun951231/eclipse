package shop.cofin.oracle.mappers;


import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.common.GenericInterface;


@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{
	
	public List<BookDto> findByBookTitle(String title);
	public List<BookDto> findByPrice(int price);
	public List<BookDto> findByPubId (int pubId);
}
