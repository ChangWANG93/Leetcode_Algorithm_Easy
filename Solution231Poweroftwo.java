
public class Solution231Poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int a=0;
		String s=Integer.toBinaryString(n);
		if (n<=0){a=1;}
		if(n>0){
		for(int i=1; i<s.length(); i=i+1){
			a=a+s.charAt(i)-48;	}}
		boolean b=(boolean)(a==0);
		//return b;
		System.out.println(a);
		System.out.println(b);

	}

}
