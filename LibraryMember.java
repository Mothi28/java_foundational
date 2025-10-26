package com.library.management.system;

import lombok.Data;

//@Data
public class LibraryMember {
	 private int memberId; 
	 private String memberName;
	 private int noOfBooksInHand;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getNoOfBooksInHand() {
		return noOfBooksInHand;
	}
	public void setNoOfBooksInHand(int noOfBooksInHand) {
		this.noOfBooksInHand = noOfBooksInHand;
	}
	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", memberName=" + memberName + ", noOfBooksInHand="
				+ noOfBooksInHand + "]";
	}
	
}
