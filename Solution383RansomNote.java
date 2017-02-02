import java.util.*;
public class Solution383RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String ransomNote="fffbfg";
		//String magazine="effjfggbffjdgbjjhhdegh";
		String ransomNote="";
		String magazine="";
		int a=1;
		int [] list=new int [26];
		for(int i=0;i<magazine.length();i++){
			int num=magazine.charAt(i)-'a';
			list[num]+=1;
		}
		for(int i=0;i<ransomNote.length();i++){
			int num=ransomNote.charAt(i)-'a';
			list[num]-=1;
			if(list[num]<0){a=0;}
		}
		
		
		
		
		System.out.println(Arrays.toString(list));
		System.out.println(a==1);
	}

}
