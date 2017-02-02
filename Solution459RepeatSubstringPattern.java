import java.util.*;

public class Solution459RepeatSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabaaab";
	    char[] c=str.toCharArray();
	    int len=c.length;//length of original string
	    
	    ArrayList <Integer> index=new ArrayList<>(); 
	    for(int i=0;i<len;i=i+1){
	     if(c[i]==c[0]){
	      index.add(i);
	     }
	    }   //extract first char
	    int a=1;
	    int subsize=2;//length of substring
	   	    int i=0;
		Set<Integer> set = new HashSet<>();
		for (int k = 0; k < c.length; k++) {
            set.add((int)c[k]);
        }
		if(set.size()==1){a=0;}
		if(index.size()==1){a=1;}
		else if(set.size()>1 && index.size()>1){

	    
	    while(subsize<=len/2){
	     if((index.get(index.size()-1)+subsize)>len){  
	           index.remove(index.size()-1); 
	           }

	     for (i=0;i<=index.size();i++){

	    	 if(i<index.size() && c[index.get(i)+subsize-1]!=c[subsize-1]){ 
	             index.remove(i);
	             i=i-1;
	             }
	            }
	     
	        if (index.size()>0){
	              if(index.size()*subsize==len && index.get(index.size()-1)+subsize==len){a=0;break;}  //repeat pattern
	              else if(index.get(index.size()-1)+subsize>len){a=1;break;} //not a repeat string
	              subsize=subsize+1;
	        }
	        if(index.size()==1){a=1;break;}  
	    }
	        } 
		System.out.println(index);
		System.out.println(a==0);				
	}
}

