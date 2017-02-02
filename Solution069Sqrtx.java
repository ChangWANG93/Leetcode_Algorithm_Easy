
public class Solution069Sqrtx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2147395599;
		long low=0;
		long high=x/2+1;
		long r=0;
		while(low<=high){
			long mid=low+(high-low)/2;
			if(mid*mid>x){high=mid-1;r=high;}
			else if(mid*mid<x){low=mid+1;r=mid;}
			else if(mid*mid==x){r=mid;break;}	
		}
		System.out.println((int)r);
		
		
		
		
	}

}
