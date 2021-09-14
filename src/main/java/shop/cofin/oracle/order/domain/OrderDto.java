package shop.cofin.oracle.order.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class OrderDto {
	private int orderId;
	private int custId;
	private int bookId;
	private int orderPrice;
	private String orderDate;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getorderPrice() {
		return orderPrice;
	}
	public void setorderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getorderDate() {
		return orderDate;
	}
	public void setorderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		
		return String.format("주문ID: %d, 고객ID: %d, 책ID: %d, 책가격: %d 도착일: %s", orderId, custId, bookId, orderPrice, orderDate);
	}
	
}
