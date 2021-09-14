package shop.cofin.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	void save(BookDto book);
	
}
