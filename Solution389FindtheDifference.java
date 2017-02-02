
public class Solution389FindtheDifference {

	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		int sums=0;
		int sumt=0;
		for(int i=0;i<s.length();i++){
			sums=sums+s.charAt(i);
		}
		for(int i=0;i<t.length();i++){
			sumt=sumt+t.charAt(i);
		}
        int add=sumt-sums;
        char a = (char)add; 
        System.out.println(a);
		
	}

}
