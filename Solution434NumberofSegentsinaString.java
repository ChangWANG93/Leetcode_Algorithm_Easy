
public class Solution434NumberofSegentsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Hello, my name is John";
				//String s="";
				String s=", , , ,        a, eaefa";
				String t=s.trim();
				int i=0;	
				if(t.length()==0){i=0;}
				else{
				String [] sp=t.split("\\s++");
				i=sp.length;}
				
				
				System.out.println(i);
				
	}

}
