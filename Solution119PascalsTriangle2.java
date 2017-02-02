import java.util.*;
public class Solution119PascalsTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowIndex=3;
			//int rowIndex1=rowIndex+1;
			int [][] a=new int [rowIndex+1][];
			for(int i=0;i<rowIndex+1;i++){a[i]=new int[i+1];}
			a[0][0]=1;
			for(int i=1;i<rowIndex+1;i++){
				a[i][0]=1;
				a[i][a[i].length-1]=1;
				for(int j=1;j<a[i].length-1;j++){
					a[i][j]=a[i-1][j-1]+a[i-1][j];    		
				}
			}
			List<Integer> l = new ArrayList<>();

			for(int i=0;i<a[rowIndex].length;i++){
				l.add(a[rowIndex][i]);
			}
				
				
			System.out.print(l);
			
	}

}
