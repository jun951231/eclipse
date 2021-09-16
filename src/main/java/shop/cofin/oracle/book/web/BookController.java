package shop.cofin.oracle.book.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.model.BookDto;
import shop.cofin.oracle.book.model.BookService;


@Controller
@RequestMapping(value = "/books")
public class BookController{

	@Autowired BookService bookService;
	@Autowired BookDto book;
	
	@RequestMapping(value = "/save", method = {RequestMethod.POST})
	public String save(BookDto book) {
		bookService.save(book);
		return "redirect:/move/home/intro";		
	}
	
	@RequestMapping("/detail/bookId")
	public String findById(@RequestParam Integer bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
		return "redirect:/move/home/intro";
	}
	@RequestMapping("/list")
	public String findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
		return "redirect:/move/home/intro";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BookDto book) {
		bookService.update(book);
		return "redirect:/move/home/intro";		
	}
	
	@RequestMapping("/delete")
	public String delete(@PathVariable Integer bookId) {
		bookService.delete(bookId);
		return "redirect:/move/home/intro";		
	}
}
