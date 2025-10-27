package com.library.management.system;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

//@Data
public class LibraryMember {
	 private int memberId; 
	 private String memberName;
	 private List<Integer> noOfBooksInHand  = new ArrayList<Integer>();
	 
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
	public List<Integer> getNoOfBooksInHand() {
		return noOfBooksInHand;
	}
	public void setNoOfBooksInHand(List<Integer> noOfBooksInHand) {
		this.noOfBooksInHand = noOfBooksInHand;
	}
	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", memberName=" + memberName + ", noOfBooksInHand="
				+ noOfBooksInHand + "]";
	}
	
}
