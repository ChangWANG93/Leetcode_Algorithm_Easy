import java.util.*;
public class Solution118PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=4;
		int numRows=5;
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		
		for(int i=0;i<numRows;i++){
			ArrayList<Integer> lj = new ArrayList<>();
			lj.add(1);
			if(i==1){lj.add(1);}
			if(i>1){
				for(int j=1;j<i+1;j++){
						if(j==i){lj.add(1);}
						else{lj.add(li.get(i-1).get(j-1)+li.get(i-1).get(j));}
										}
					}
			li.add(lj);
			System.out.println(lj);
			}
			    	    
	    
	   // System.out.println(li);
	    
	}

}
/*//ArrayList<List>l=new ArrayList<>();
int [][] a=new int [numRows][];
for(int i=0;i<numRows;i++){a[i]=new int[i+1];}
a[0][0]=1;
//List<List<Integer>> triangle = new ArrayList<List<Integer>>();
for(int i=1;i<numRows;i++){
	a[i][0]=1;
	a[i][a[i].length-1]=1;
	for(int j=1;j<a[i].length-1;j++){
		a[i][j]=a[i-1][j-1]+a[i-1][j];    		
	}
}
List<int[]> list = Arrays.asList(a);
*/	    
