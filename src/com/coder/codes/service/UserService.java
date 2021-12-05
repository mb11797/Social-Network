package com.coder.codes.service;

import java.util.List;
import java.util.Map;

import com.coder.codes.dao.UserRepo;
import com.coder.codes.entity.User;

public class UserService {
	
	public static UserRepo userRepo = new UserRepo();
	
	public static void createUser(Long userId, String userName, String desc) {
		userRepo.addNewUser(userId, new User(userId, userName, desc));
		System.out.println("User Registered");
	}
	
	public static void printAllUserInfo() {
		System.out.println("All Users Info:");
		for(Map.Entry<Long, User> m: userRepo.getAllUsers().entrySet()) {
			System.out.println(m.getValue());
			List<User> followers = m.getValue().getFollowers();
			List<User> following = m.getValue().getFollowing();
			System.out.println("Followers: ");
			for(User u: followers) {
				System.out.print(u.getUserName() + " | ");
			}
			System.out.println();
			
			System.out.println("Following: ");
			for(User u: following) {
				System.out.print(u.getUserName() + " | ");
			}
			System.out.println();
		}
		System.out.println("**************");
	}
	
	public static void followUser(Long userId, Long followerId) {
		userRepo.followUser(userId, followerId);
		System.out.println("Followed");
	}

	public static void unfollowUser(Long userId, Long followerId) {
		userRepo.unfollowUser(userId, followerId);		
		System.out.println("Unfollowed");
	}
	
	
}
