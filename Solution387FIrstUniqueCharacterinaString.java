import java.util.ArrayList;
import java.util.*;

public class Solution387FIrstUniqueCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="loveleetcode";
		char[] c = s.toCharArray();
		Arrays.sort(c); //sort the array
		int idx=0;
		
		if(s.length()==0){idx=-1;}
		if(s.length()==1){idx=0;}
		else if(s.length()>1){
		ArrayList<Character> unique=new ArrayList<>();
		if(c[0]!=c[1]){ 
			unique.add(c[0]); 
			System.out.println(unique); 
			}
		
		for(int i=1;i<c.length;i++){
			if(i<c.length-1){
			if(c[i-1]!=c[i]&&c[i]!=c[i+1]){
				unique.add(c[i]);
				System.out.print(unique);
			}}
			}
		if(c[c.length-2]!=c[c.length-1]){
			unique.add(c[c.length-1]);
			System.out.println(unique);
			}      //find all unique characters
			
			
			if(unique.size()==0){idx=-1;}
			else if (unique.size()>0){
			idx=s.indexOf((char)unique.get(0));
			for(int i=0;i<unique.size();i++){
			if(idx>=s.indexOf((char)unique.get(i))){
				idx=s.indexOf((char)unique.get(i));
				System.out.println("s"+idx);     }
					}
				}
			}

		//System.out.println(Arrays.toString(c));
		//System.out.println("result"+unique);
		System.out.println(idx);
				

	}

}
