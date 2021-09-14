package shop.cofin.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component	@Data
public class CustomerDto {
	private String custId;
	private String custName;
	private String address;
	private String phone;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		return String.format("고객ID: %d, 고객이름: %s, 고객주소: %s, 고객번호: %d", custId, custName, address, phone);
	}
	
	

}
