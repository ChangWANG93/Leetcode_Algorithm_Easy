import java.util.*;

public class Solution038CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String s="1";
		int count =1;
		int k=1;
		while(k<n){
			StringBuilder t=new StringBuilder();
			//t.append(s.charAt(0));
			for(int i=1;i<=s.length();i++){
								
				if(i==s.length() || s.charAt(i-1)!=s.charAt(i)){
					t.append(count);    t.append(s.charAt(i-1));
					count=1;
				}
				else if(s.charAt(i-1)==s.charAt(i)){count=count+1;}
			     }	
				s=t.toString();
				k=k+1;
				System.out.println("k:"+k);

			}
				
			
			System.out.println(s);
			
		
		
		
	}

}








	/*//String s="1111123263824362562";
			int n=2;
			int start=1;
			int k=1;
			String s=start+"";

			while(i<n){
					
			int[] nums= new int[s.length()];
			for(int i=0;i<s.length();i++){
				nums[i]=s.charAt(i)-'0';}
			
			Arrays.sort(nums);
			StringBuilder time=new StringBuilder();
			int num=1;
			if(nums[0]==nums[nums.length-1]){
				time.append(nums.length);time.append(nums[0]);
			}
			else{
			for(int i=0;i<nums.length-1;i++){
				if(nums[i]==nums[i+1]){num=num+1;}
				else if(nums[i]!=nums[i+1] ){
					time.append(num);
					time.append(nums[i]);
					num=1;	
				    if(nums[i]!=nums[i+1] && nums[i+1]==nums[nums.length-1]){
				    	time.append(nums.length-i-1);
				    	time.append(nums[i+1]);		  }
						}
					}
			}
			//String t= time.toString();
			
				System.out.println(Arrays.toString(nums));
				System.out.println(time.toString());
*/