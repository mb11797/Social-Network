package com.coder.codes.service;

import java.util.List;

import com.coder.codes.dao.FeedRepo;
import com.coder.codes.dao.UserRepo;
import com.coder.codes.entity.Post;
import com.coder.codes.entity.User;

public class FeedService {
	
//	public static FeedRepo feedRepo = new FeedRepo();
//	public static UserRepo userRepo = new UserRepo();
	
	public static void updateFeed(Long userId, Post post) {
		User usr = UserRepo.getAllUsers().get(userId);
		List<User> allFollowers = usr.getFollowers();
		
		for(User u: allFollowers) {
			FeedRepo.updateFeed(u.getUserId(), post);
		}
	}
	
	public static void printFeed(Long userId) {
		List<Post> allPosts = FeedRepo.getFeed(userId).getPosts();
		for(Post p: allPosts) {
			System.out.println(p);
		}
	}
	
}
