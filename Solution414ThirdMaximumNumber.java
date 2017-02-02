import java.util.*;

public class Solution414ThirdMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,2,3,1};
		int x=0;
		if(nums.length==1){x=nums[0];}
		else{
			SortedSet<Integer> set=new TreeSet<>();
			for(int i=0;i<nums.length;i++){
				set.add(nums[i]);
				}
			Object[] a = set.toArray();
				if(a.length==2||a.length==1){x=(int)a[a.length-1];}
				else {x=(int) a[a.length-3];}
				}
		
		System.out.println(x);
		//System.out.println(a);
	}

}
