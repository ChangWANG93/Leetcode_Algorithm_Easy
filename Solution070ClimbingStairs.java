import java.util.*;
public class Solution070ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int c=1;
		if(n==2) c=2;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		if(n>1){
			for(int i=2;i<n;i++){
			c=list.get(i-1)+list.get(i-2);
			list.add(c);
					}
		}
		System.out.println(c);
		//System.out.print(list);
	}

}
