import java.util.Arrays;

public class Solution026RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums={1,1,2,2};
		int n=1;int j=1;
		if(nums.length<2){n=nums.length;}
		else{
		for(int i=0;i<nums.length-1;i++){
			//nums[0]=nums[0];
			if(nums[i]!=nums[i+1]){ 
				nums[j]=nums[i+1];
				n=n+1;
				j=j+1;}		
			}
		//if(nums[nums.length-2]!=nums[nums.length-1]){nums[j]=nums[nums.length-1];}
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(n);
	}

}
