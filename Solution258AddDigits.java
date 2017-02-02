
public class Solution258AddDigits {

	public static void main(String[] args) {
		int num=11;
		int b=0;
		if(num<10){ b=num;}
		if(num==10){ b=1;}
		if(num>10){	b=(num-1)%9+1;}
	
	
	System.out.println(b);
	}
	}

