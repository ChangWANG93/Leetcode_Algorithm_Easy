import java.util.Arrays;

public class Solution169MajorityElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums={1,2,3,4,5,3,3,3,3};
			Arrays.sort(nums);
			int n=nums.length/2+1;
			System.out.println(nums[n]);
			System.out.println(Arrays.toString(nums));
			
			
			
	}
}
