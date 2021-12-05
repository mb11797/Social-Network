package com.coder.codes.service;

import com.coder.codes.dao.PostRepo;
import com.coder.codes.entity.Post;

public class PostService {
	public static PostRepo postRepo = new PostRepo();
	
//	public static FeedService feedService = new FeedService();
	
	public static void createPost(Long userId, Long postId, String contents) {
		Post p = new Post(userId, postId, contents, System.currentTimeMillis());
		postRepo.addNewPost(userId, p);
		FeedService.updateFeed(userId, p);
		System.out.println("Post Created");
	}
	
}
