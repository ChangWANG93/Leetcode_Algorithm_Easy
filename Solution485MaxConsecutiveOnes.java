
public class Solution485MaxConsecutiveOnes {

	public static void main(String[] args) {
		int [] nums = {1,1,0,0,1,1,1,0,1,1,1,1,1};
		int count=0;
		int m=0;
		for(int i=0; i<nums.length;i=i+1){
			if(nums[i]==1){
				count=count+1;
				if(count>m){m=count;}
			}
			else {count=0;}
	}
		System.out.println(count);
}
}