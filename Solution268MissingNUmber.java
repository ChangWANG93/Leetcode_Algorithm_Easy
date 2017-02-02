import java.util.Arrays;

public class Solution268MissingNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,0};
		Arrays.sort(nums);
		int r=0;
		int n=0;
		for(int i=0;i<nums.length;i++){
			//r=nums[i]-nums[i-1];
			//if(r!=1){n=i;break;}
			r=nums[i]^i;
			if(r!=0){n=i;break;}
			if(r==0){n=i+1;}
		
		}
	
		
		System.out.println(n);
		
		
		
	}

}
