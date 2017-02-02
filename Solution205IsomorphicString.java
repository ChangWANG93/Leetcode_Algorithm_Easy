import java.util.*;

public class Solution205IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="egg";
		
		String t="add";
		
		ArrayList<Integer> l1=new ArrayList<>();
		for(int i=0;i<s.length();i++){
			l1.add((int)s.charAt(i));
		}
		int x=123;
		String n=x+"";
		int i=3;
		int p;
		 if(x%i==0){p=i-1;}
	       else{p=x%i-1;}
		System.out.println(n.charAt(p)-'0');
		
		//System.out.println(l1);
		//System.out.println(l2);
		
	}

}
