package shop.cofin.oracle.book.service;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.domain.BookDto;

@Component
public interface BookService {
	void save(BookDto book);
}
