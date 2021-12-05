package com.coder.codes.entity;

import java.util.ArrayList;
import java.util.List;

public class Post {
	Long postId;
	Long userId;
	String contents;
	Long time;
	List<User> likedUsers = new ArrayList<>();
	
	public Post(Long userId, Long postId, String contents, Long time) {
		this.userId = userId;
		this.postId = postId;
		this.contents = contents;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", contents=" + contents + ", time=" + time
				+ ", likedUsers=" + likedUsers + "]";
	}
	public List<User> getLikedUsers() {
		return likedUsers;
	}
	public void setLikedUsers(List<User> likedUsers) {
		this.likedUsers = likedUsers;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
}
