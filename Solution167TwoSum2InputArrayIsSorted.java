
public class Solution167TwoSum2InputArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,5,7,11};
		int target=9;
		int[] ans=new int[2];
		
		int i=0;
		int low=0;
		int high=numbers.length-1;
		//int mid=0;
		while(low<=high){
			if(numbers[low]+numbers[high]>target){ high=high-1;}
			else if(numbers[low]+numbers[high]<target){ low=low+1;}
			//else if ((numbers[low]+numbers[high])==target){break;}
			else break;
		
		}
				ans[0]=low+1;
				ans[1]=high+1;
		//ans[0]=numbers[low];
		//ans[1]=numbers[high];
		
		
		
		
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}

}
