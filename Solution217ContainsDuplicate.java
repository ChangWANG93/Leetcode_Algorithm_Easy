import java.util.HashSet;
import java.util.Set;

public class Solution217ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={1,2,3,4,5};
		int l1=nums.length;
		Set<Integer> set = new HashSet<>();
		for (int k = 0; k < nums.length; k++) {
            set.add((int)nums[k]);
        }
		int l2=set.size();
		System.out.print(l1!=l2);
		
		
		
		

	}

}
