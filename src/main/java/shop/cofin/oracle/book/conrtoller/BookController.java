package shop.cofin.oracle.book.conrtoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;


@Controller
public class BookController{

	@Autowired BookService bookService;

	@RequestMapping("/save")
	public void save(BookDto t) {
		bookService.save(t);
	}

	@RequestMapping("/find/{id}")
	public BookDto findById(Integer id) {
		return bookService.findById(id);
	}

	@RequestMapping("/list")
	public List<BookDto> findAll() {
		return bookService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody BookDto t) {
		bookService.update(t);
	}

	@RequestMapping(value = "/delet/{id}", method = RequestMethod.DELETE)
	public void delete(Integer id) {
		bookService.delete(id);
	}
		

}
