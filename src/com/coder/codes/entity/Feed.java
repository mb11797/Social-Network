package com.coder.codes.entity;

import java.util.ArrayList;
import java.util.List;

public class Feed {
	Long userId;
	List<Post> posts;
	
	public Feed(Long userId) {
		this.userId = userId;
		this.posts = new ArrayList<>();
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
