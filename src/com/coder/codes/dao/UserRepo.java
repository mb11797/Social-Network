package com.coder.codes.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.coder.codes.entity.User;

public class UserRepo {
	public static Map<Long, User> allUsers = new HashMap<>();
	
	public void addNewUser(Long userId, User user) {
		allUsers.put(userId, user);
	}

	public static Map<Long, User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(Map<Long, User> allUsers) {
		UserRepo.allUsers = allUsers;
	}
	
	public void followUser(Long userId, Long followerId) {
		User followedUser = UserRepo.allUsers.get(userId);
		User followingUser = UserRepo.allUsers.get(followerId);
		List<User> followers = followedUser.getFollowers();
		followers.add(followingUser);
		followedUser.setFollowers(followers);
		// Update Following
		List<User> following = followingUser.getFollowing();
		following.add(followedUser);
		followingUser.setFollowing(following);
	}

	public void unfollowUser(Long userId, Long followerId) {
		User followedUser = UserRepo.allUsers.get(userId);
		User followingUser = UserRepo.allUsers.get(followerId);
		List<User> followers = followedUser.getFollowers();
		followers.remove(followingUser);
		followedUser.setFollowers(followers);
		// update following
		List<User> following = followingUser.getFollowing();
		following.remove(followedUser);
		followingUser.setFollowing(following);
	}
	
	public User getUser(Long userId) {
		return allUsers.get(userId);
	}
}
