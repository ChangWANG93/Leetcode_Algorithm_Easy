
public class Solution171ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A";
		int l=s.length();
		int c=0;
		for(int i=0;i<l;i++){
			c=(int) (c+(s.charAt(s.length()-i-1)-'A'+1)*Math.pow(26, i));
			System.out.println(c);

		}
		//System.out.println(c);
	}

}
