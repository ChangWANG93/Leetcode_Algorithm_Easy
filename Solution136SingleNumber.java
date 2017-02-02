import java.util.Arrays;
public class Solution136SingleNumber {

	public static void main(String[] args) {
		int[] nums={2,2,1};
		Arrays.sort(nums);
		int s=0;
		int n = nums.length;
		if(n==1){s=nums[0];}
		if(n>1){
		for(int i=0;i<n;i=i+2){
			if(i<n-2){
			//if(nums[i]==nums[i+1]){ }
			if(nums[i]!=nums[i+1]){
				s=nums[i];break;}}
			if(i==n-1){s=nums[n-1];}
		}		
		System.out.println(s);
		//String l=nums.toString();	
		System.out.println(Arrays.toString(nums));
	}
}}
