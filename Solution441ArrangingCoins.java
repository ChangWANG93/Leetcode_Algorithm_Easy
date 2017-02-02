
public class Solution441ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=1804289383;
			//int n=1;
			int low=0;
			int high=n;
			//int high=(int) (Math.sqrt(n)+1);
			int mid=0;
			int coin=0;
			int sum=0;
			int i;
			while(low<=high){
				mid=low+(high-low)/2;
				if (0.5*mid*(mid+1)<=n){low=mid+1;coin=low-1;}
				//else if (mid*(mid+1)*0.5==n){coin=mid;break;}
				else{high=mid-1;coin=low-1;}						
			}			
			/*for(i=0;i<=n;i++){
				sum=sum+i;
			    if (sum<=n){coin=i;}
			    else {coin=i-1;break;}
			    
			}		
			
*/			
			
			
			//System.out.println(low-1);
			System.out.println(low);
			}
			
			
			
	}
