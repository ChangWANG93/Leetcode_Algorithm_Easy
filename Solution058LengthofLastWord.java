
public class Solution058LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab ccc   ";
		String t=s.trim();
		t.split("\\s++");
		
		int n=0;
		if(t.length()==0){n=0;}
		else{n=t.length()-1-t.lastIndexOf(' ');}
		
		
		System.out.println(t.lastIndexOf(' '));
		System.out.println(t);
		System.out.println(n);

		
		

	}

}
