import java.util.ArrayList;
import java.util.Arrays;

public class Solution283MoveZeroes {

	public static void main(String[] args) {
		int[]  nums={0,1,0,3,12};
		int k=0;
		int x;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0)
			{x=nums[k];
			nums[k]=nums[i];
			nums[i]=x;
			k=k+1;
			}}
		//System.out.println(nums);	

	}}

/*int count=0;
          ArrayList<Integer> list = new ArrayList();
          for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               list.add(nums[i]);}
           if(nums[i]==0){ count=count+1;}}
          for(int k=0;k<count;k++){
           list.add(Integer.valueOf(0));
          }
                int[] newnums=new int[nums.length];
                for (int k=0; k<nums.length;k++){
                 newnums[k]=list.get(k);
                }
                for (int p=0; p<nums.length;p++){
                 nums[p]=newnums[p];
                }
                System.out.println(newnums);

*/