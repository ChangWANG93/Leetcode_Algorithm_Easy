
public class Solution367ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=808201;
		long low=0;
		long high=num/2+1;
		int a=1;
		int i=0;
		while(low<=high){
			long mid=low+(high-low)/2;
			if(mid*mid>num){high=mid-1;}
			if(mid*mid<num){low=mid+1;}
			else if(mid*mid==num) {a=0;break;}
			System.out.println(i+"mid:"+mid);	
			i=i+1;
			}
		
		
		System.out.println(a==0);
		
	}

}
