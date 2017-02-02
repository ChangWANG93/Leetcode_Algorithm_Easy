import java.util.*;
public class Solution020ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[(()())({})[()]";
		ArrayList <Character> sc=new ArrayList<>();
		for(int i=0;i<s.length();i++){
			sc.add(s.charAt(i));
		}
		int j=0;
		int l=sc.size();
		int k=0;
		int result=0;
		while(j<l)	{
			int i=0;
			while(i<sc.size()-1){
				//System.out.println("i:"+i);
				if((sc.get(i)=='(') && (sc.get(i+1)==')'))  {
					sc.remove(i);sc.remove(i);
					j=j+2;
					System.out.println("()r:"+sc);
					//continue;
					}
				else if((sc.get(i)=='[') && (sc.get(i+1)==']'))  {
					sc.remove(i);sc.remove(i);
					System.out.println("[]r:"+sc);
					j=j+2; 
					//continue;
					}
				else if((sc.get(i)=='{') && (sc.get(i+1)=='}'))  {
					sc.remove(i);sc.remove(i);
					j=j+2; 
					System.out.println("{}r:"+sc);
					//continue;
					}						
				else{i=i+1;}	
				System.out.print("i:"+i);
				System.out.println("  "+"j:"+j);	
				
			}		
			k=k+1;
			if(sc.size()==0){result=1;break;}
			if(k==l-1){result=0;break;}
			
		}
		
		System.out.println(result==1);
		System.out.println(sc);
		
	}

}
