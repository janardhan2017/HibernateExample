package com.otm.entities;

public class Member {
	protected int memberNo;
	protected String memberName;
	protected String experience;
	protected String designation;
	protected String role;

public int getMemberNo() {
	return memberNo;
}
public void setMemberNo(int memberNo) {
	this.memberNo = memberNo;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", experience=" + experience
			+ ", designation=" + designation + ", role=" + role + "]";
}

}