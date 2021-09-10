package shop.cofin.oracle.book.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class BookDto {
	private int bookId;
	private String bookTitle;
	private int price;
	private int pubId;
	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public int getBookPrice() {
		return price;
	}

	public void setBookPrice(int price) {
		this.price = price;
	}
	
	public int getBookPubId() {
		return pubId;
	}

	public void setBookPubId(int pubId) {
		this.pubId = pubId;
	}
	
	@Override
	public String toString() {
		
		return String.format("책ID: %d, 책제목: %s, 책가격: %d, 출판사ID: %d", bookId, bookTitle, price, pubId);
	}
}