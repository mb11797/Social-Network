

import java.util.Scanner;

import com.coder.codes.service.FeedService;
import com.coder.codes.service.PostService;
import com.coder.codes.service.UserService;

public class SocialNetworkTwitter {

	public static void main(String[] args) {
		
		System.out.println("Started");		
		
		SocialMediaManager manager = new SocialMediaManager();
		
		Scanner scan = new Scanner(System.in);
		
		UserService.createUser(1L, "MB", "Hey");
		UserService.createUser(2L, "PB", "Hey");
		UserService.createUser(3L, "CB", "Hey");
		
		PostService.createPost(1L, 1L, "MB_POST_1");
		PostService.createPost(1L, 1L, "MB_POST_2");
		PostService.createPost(2L, 1L, "PB_POST_1");
		PostService.createPost(2L, 2L, "PB_POST_2");
		PostService.createPost(3L, 1L, "CB_POST_1");
		PostService.createPost(3L, 2L, "CB_POST_2");

		UserService.printAllUserInfo();
		
		while(true) {
			String cmd = scan.nextLine();
			String[] tokens = cmd.split(" ");
			
			switch(tokens[0]) {
			case "REGISTER_USER":
				UserService.createUser(Long.parseLong(tokens[1]), tokens[2], tokens[3]);
				break;
			case "FOLLOW_USER":
				UserService.followUser(Long.parseLong(tokens[1]), Long.parseLong(tokens[2]));
				break;
			case "GET_FEED":
				FeedService.printFeed(Long.parseLong(tokens[1]));
				break;
			case "UNFOLLOW_USER":
				UserService.unfollowUser(Long.parseLong(tokens[1]), Long.parseLong(tokens[2]));
				break;
			case "GET_ALL_USER_INFO":
				UserService.printAllUserInfo();
				break;
			case "CREATE_POST":
				PostService.createPost(Long.parseLong(tokens[1]), Long.parseLong(tokens[2]), tokens[3]);
				break;
			case "exit":
				scan.close();
				return;
			}			
		}
		
	}

}
