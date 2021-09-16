package shop.cofin.oracle.publisher.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDto {
	private int pubId;
	private String pubName;
	private String marName;
	private String phone;
		
	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getMarName() {
		return marName;
	}

	public void setMarName(String marName) {
		this.marName = marName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("상품ID: %d, 출판사ID: %s, 작가이름: %s, 연락처: %s", pubId, pubName, marName, phone);
	}
}
