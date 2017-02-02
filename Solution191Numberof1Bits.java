
public class Solution191Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=11;
			int count=0;
			String s=Integer.toBinaryString(n);
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'){count=count+1;}
			}

		System.out.println(count);
		System.out.println(s);
		System.out.println(s.charAt(2));
	}

}
