package com.coder.codes.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.coder.codes.entity.Feed;
import com.coder.codes.entity.Post;

public class FeedRepo {
	public static Map<Long, Feed> allFeeds = new HashMap<>();
	
	public static Feed getFeed(Long userId) {
		return FeedRepo.allFeeds.get(userId);
	}
	
	public static void addNewFeed(Long userId, Feed feed) {
		FeedRepo.allFeeds.put(userId, feed);
	}
	
	public static void updateFeed(Long userId, Post post) {
		if(FeedRepo.allFeeds.containsKey(userId)) {
			List<Post> allPosts = FeedRepo.allFeeds.get(userId).getPosts();
			allPosts.add(post);
			FeedRepo.allFeeds.get(userId).setPosts(allPosts);		}
		else {
			FeedRepo.addPostInNewFeed(userId, post);
		}

	}

	public static void addPostInNewFeed(Long userId, Post post) {
		Feed feed = new Feed(userId);
		List<Post> allPosts = feed.getPosts();
		allPosts.add(post);
		FeedRepo.addNewFeed(userId, feed);
	}
	
}
