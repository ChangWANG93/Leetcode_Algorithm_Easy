import java.util.Arrays; 
import java.util.ArrayList;

public class Solution448DisappearedNumbers {

	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		int n = nums.length;
		Arrays.sort(nums);
		int[] all = new int[n];
		for(int i=0; i<n;i++){
			if(i<n-1 && nums[i]!=nums[i+1]){
				all[nums[i]-1]=nums[i];}
			if(i==n-1) all[nums[i]-1]=nums[i];
		}
		ArrayList<Integer> list=new ArrayList<>();
		for (int i=0; i<n; i++){
			if(all[i]!=i+1){
				list.add(Integer.valueOf(i+1));	
			}
		}
		//int[] 
		//String dis= Arrays.toString(all);
		
		System.out.println(list);
	}
}
