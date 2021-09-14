package shop.cofin.oracle.book.conrtoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;



@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired BookService bookService;
	@Autowired BookDto book;
	
	@RequestMapping(value="/join", method = {RequestMethod.POST})
	public String join(
			@RequestParam("bookId") int bookId,
			@RequestParam("bookTitle") String bookTitle,
			@RequestParam("price") int price,
			@RequestParam("pubId") int pubId) {
		System.out.println("bookId :" + bookId);
		System.out.println("bookTitle :" + bookTitle);
		System.out.println("price :" + price);
		System.out.println("pubId :" + pubId);
		book = new BookDto();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setPrice(price);
		book.setPubId(pubId);
		bookService.save(book);
		
		return "/book/Login";
	}
	
	
	@RequestMapping(value="/login", method = {RequestMethod.POST})
	public String login() {
		return "Login";
	}

}
