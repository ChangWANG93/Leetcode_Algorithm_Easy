
public class Solution009PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-1;
		int l1=x; int l2=x; int l3=x;
		int i=0;  int k=0;
		int m,n;
		int result=0;
		if(x==-1){result=1;}
		else{
		while(l1>=10){
			l1=l1/10;
			i=i+1;
			System.out.print("l1:"+l1+"  ");
		}
		while(k<i+1){
			m=l2%10;
			n=(int) (l3/(Math.pow(10,i-k)));		
			l3=(int) (l3-n*(Math.pow(10,i-k)));
			l2=l2/10;
			k=k+1;
			
			if(m!=n){result=1;break;}
			System.out.print("m:"+m+"  ");
			System.out.print("n:"+n+"  ");
			System.out.println("l3:"+l3);

		}
		}
		
		
	System.out.println(result==0);
	}

}
