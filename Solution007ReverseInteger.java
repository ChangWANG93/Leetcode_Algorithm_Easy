
public class Solution007ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-2147483648;
		//int x1=x;
		int m=0;
		if(x<0){m=1;}
			//System.out.println("x"+m);
		String s=String.valueOf(x);
		System.out.println("s"+s);

		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1;i>=m;i--){
				s1.append(s.charAt(i));	
					}
			String s2=s1.toString();
			System.out.println("stwo"+s2);
			Long n=Long.parseLong(s2);
			System.out.println("n"+n);
			int r=0;
			if(n<=2147483647 && n>=-2147483648){
				if(x>=0){r=new Long(n).intValue();}
				else if(x<0){r=new Long(n).intValue(); 
				          r=r*(-1);
				}
			}
			else{r=0;}

		System.out.println(r);

		}
	}

