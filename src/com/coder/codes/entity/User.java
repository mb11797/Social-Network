package com.coder.codes.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	Long userId;
	String userName;
	String desc;
	List<User> followers = new ArrayList<>();
	List<User> following = new ArrayList<>();
	
	public User(Long userId, String userName, String desc) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.userName = userName;
		this.desc = desc;
	
	}
	public List<User> getFollowers() {
		return this.followers;
	}
	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}
	public List<User> getFollowing() {
		return following;
	}
	public void setFollowing(List<User> following) {
		this.following = following;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", desc=" + desc + "]";
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}	
}
