package shop.cofin.oracle.book.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDto, Integer>{

	public List<BookDto> findByBookTitle(String title);
	public List<BookDto> findByPrice(String price);
	public List<BookDto> findByPubId(String pubId);
}
