package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Blog 
{

	
	public User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user){
		this.user = user;
		allPosts = new ArrayList<Post>();
	}
	

	
	public void post(Post p){
		allPosts.add(p);
		System.out.println(p);
	}
	
	public void list(){
		for(int i = 0; i<allPosts.size(); i++){
			System.out.println(allPosts.get(i));
		}
	}
	
	public void delete(int index){
		if(index > allPosts.size()){
			System.out.println("Error");
		}
		else
			allPosts.remove(index);
		
	}



	public User getUser() {
		return user;
	}



	public ArrayList<Post> getAllPosts() {
		return allPosts;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public void setAllPosts(ArrayList<Post> allPosts) {
		this.allPosts = allPosts;
	}
	
}
	
	
	

