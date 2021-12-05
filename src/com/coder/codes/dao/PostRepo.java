package com.coder.codes.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.coder.codes.entity.Feed;
import com.coder.codes.entity.Post;

public class PostRepo {
	Map<Long, List<Post>> allPosts = new HashMap<>();
	
	
	
	public PostRepo() {
	}

	public List<Post> getAllPosts(Long userId) {
		return allPosts.get(userId);
	}
	
	public void addNewPost(Long userId, Post post) {
		if(allPosts.containsKey(userId)) {
			List<Post> allPostsOfUser = allPosts.get(userId);
			allPostsOfUser.add(post);
		}
		else {
			List<Post> allPostsOfUser = new ArrayList<>();
			allPostsOfUser.add(post);
			allPosts.put(userId, allPostsOfUser);
		}
		FeedRepo.updateFeed(userId, post);
	}

	public Map<Long, List<Post>> getAllPosts() {
		return allPosts;
	}

	public void setAllPosts(Map<Long, List<Post>> allPosts) {
		this.allPosts = allPosts;
	}
	
}
