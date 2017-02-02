import java.util.*;
public class Solution121BestTimeToBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] prices={7};
		int profit=0;

		if(prices.length>1){
		int ini=prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]>ini){
				profit=Math.max(profit,prices[i]-ini );
							}
			else{ini=prices[i];}
			}
		}
				
		System.out.println("result:"+profit);
	}

}
