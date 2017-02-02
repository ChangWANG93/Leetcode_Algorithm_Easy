import java.util.Arrays;

public class Solution463IslandPerimeter {

	public static void main(String[] args) {
		int[] [] square={
				{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}  };
		//int[] [] grid={[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]  };
       // String grid=Arrays.deepToString(square);
		int nb=0;
		int land=0;
		int p=0;
        for(int i=0; i<square.length; i=i+1){
        	for(int j=0; j<square[i].length; j=j+1){
        		if(square[i][j]==1){
           			if(i<square.length-1 && square[i+1][j]==1) {
           				nb=nb+1;
           				}
          			if(j<square[i].length-1 && square[i][j+1]==1) {
          				nb=nb+1;
          				}
        		    land=land+1;
        		    }
        	}     	
        }
         p=land*4-nb*2;  
         System.out.println(p);
         //System.out.println(square[0].length);
		//System.out.println(Arrays.deepToString(square));
	}
  
}
