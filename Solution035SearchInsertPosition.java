
public class Solution035SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1};
		int target=2;
		int lo=0;
		int mid=0;
		int p=0;
		int hi=nums.length-1;
		if(target>nums[hi]){p=hi+1;}
		else if(target<nums[lo]){p=0;}
		else {while(lo<=hi){
				mid=(hi+lo)/2;
				if(target<nums[mid]){ hi=mid-1;p=lo;}
				else if(target>nums[mid]){ lo=mid+1;p=lo;}
				else if (target==nums[mid]){p=mid;break;}
				//System.out.println("lo"+lo);
				//System.out.println("hi"+hi);
				//System.out.println("mid"+mid);
				}
		//p=lo;
		}
		System.out.println("lo"+lo);
		System.out.println("hi"+hi);
		System.out.println("mid"+mid);
		System.out.println("p"+p);
	
	}

}
