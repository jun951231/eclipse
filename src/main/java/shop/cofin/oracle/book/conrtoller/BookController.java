package shop.cofin.oracle.book.conrtoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;


@Controller
@RequestMapping("/books")
public class BookController{

	@Autowired BookService bookService;
	@Autowired BookDto book;
	
	@RequestMapping(value = "/save", method = {RequestMethod.POST})
	public String save(BookDto book) {
		bookService.save(book);
		return "redirect:/move/book/List";		
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public BookDto findById(@RequestParam(name = "bookId") Integer bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
		return book;
	}
	@RequestMapping("/")
	public String findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
		return "전체 책 조회";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BookDto book) {
		bookService.update(book);
		return "책 수정";		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("bookId") Integer bookId) {
		bookService.delete(bookId);
		return "책 삭제";		
	}
	@RequestMapping("/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}	
}
