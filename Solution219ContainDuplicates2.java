import java.util.HashSet;
import java.util.Set;

public class Solution219ContainDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,1};
		int k=5;
		
		int l1=nums.length;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
            set.add((int)nums[k]);
        }
		int l2=set.size();
		System.out.print(l1!=l2);
			
		
		
		System.out.println(l1!=l2 &&);

	}

}
