//import java.util.ArrayList;
//import java.util.List;

public class Solution344ReverseString {

	public static void main(String[] args) {
		String s="Hello World";
		StringBuilder string = new StringBuilder();
		int n=s.length();
		for(int i=n-1;i>=0;i=i-1){
			//char a = s.charAt(i);
			//string.append(a);
			string.append(s.charAt(i));
			
		}
		String s1 = string.toString();
		System.out.println(s1);
		//return(s1);
	}
}
