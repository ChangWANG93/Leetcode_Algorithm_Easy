import java.util.Arrays;

public class Solution492ConstructtheRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area=7;
		int l=(int)Math.sqrt(area);
		while(area%l!=0){
			l=l-1;
		}
		int[] wl=new int[2];
		wl[0]=l;
		wl[1]=area/l;
		System.out.println(Arrays.toString(wl));
	}

}
