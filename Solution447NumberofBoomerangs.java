import java.util.Arrays;
public class Solution447NumberofBoomerangs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] points={{1,1},{2,2},{3,3}};
		int size = points.length*(points.length-1)/2;
		int[][] pair=new int [size][4];
		int k=0;		
		for(int i=0;i<points.length;i=i+1){
			for(int j=i+1;j<points.length;j=j+1){
				pair[k][0]=points[i][0];
				pair[k][1]=points[i][1];
				pair[k][2]=points[j][0];
				pair[k][3]=points[j][1];
				k=k+1;
			}
		} // Extract all pairs
		int k1=0;
		int count=0;
		int dist1;
		int dist2;
		for(int i=0;i<size;i++){
			for(int j=0;j<points.length;j++){
				int xa=pair[i][0];
				int ya=pair[i][1];
				int xb=pair[i][2];
				int yb=pair[i][3];
				int xc=points[j][0];
				int yc=points[j][1];
				dist1=(points[j][0]-pair[i][0])*(points[j][0]-pair[i][0])+(points[j][1]-pair[i][1])*(points[j][1]-pair[i][1]);
				dist2=(points[j][0]-pair[i][2])*(points[j][0]-pair[i][2])+(points[j][1]-pair[i][3])*(points[j][1]-pair[i][3]);
				System.out.print(""+dist1);
				System.out.print(","+dist2);
				System.out.print(":"+xc);
				System.out.print(","+yc);
				if(dist1==dist2){count=count+1;}
				System.out.println("s"+count);

							}	
		}

		
		
		
			System.out.println(count*2);
		System.out.println(Arrays.deepToString(pair));
		//System.out.println(points[0][0]);
	}

}
/*int k1=0;
int count=0;
for(int i=0;i<size;i=i+1){
	for(int j=0;j<points.length;j=j+1){
		k1=(pair[i][1]*2-points[j][1])/(pair[i][0]*2-points[j][0]);
		System.out.println(k1);
		if( k1*pair[i][2]==0){
			count=count+1;}			
	}	
}
*/		
