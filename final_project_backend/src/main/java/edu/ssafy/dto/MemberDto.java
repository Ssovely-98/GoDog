package edu.ssafy.dto;

public class MemberDto {
	private String userId;
	private String userPwd;
	private String userName;
	private String userEmail;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", userEmail="
				+ userEmail + "]";
	}
	
}
