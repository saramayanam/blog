package base;

import java.util.Comparator;




public class PostSortByContentLength implements Comparator<Post> {

	
	
	
	
	
	
	@Override
	public int compare(Post p1, Post p2) {
		// TODO Auto-generated method stub
		
		if(p1.getContent().length() == p2.getContent().length())
			return 0;
		

		if(p1.getContent().length() > p2.getContent().length())
			return 1;
		
			
		if(p1.getContent().length() < p2.getContent().length())
				return -1;
		
		return 0;

	}

	
}