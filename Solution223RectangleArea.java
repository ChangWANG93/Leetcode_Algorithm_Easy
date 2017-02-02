
public class Solution223RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int A = -3; int B = 0;
			int C = 3;  int D = 4;
			int E = 0;  int F = -1;
			int G = 9;  int H = 2;
			int left,right,bottom,up=0;
			left = Math.max(A, E);
			right = Math.min(C,G);
			up = Math.min(D, H);
			bottom = Math.max(B, F);
			
			int overlap=0;
			if(left<right&&up>bottom){
			overlap=(right-left)*(up-bottom);}
			int area=(C-A)*(D-B)+(G-E)*(H-F)-overlap;
			System.out.println(area);
			
	}

}
