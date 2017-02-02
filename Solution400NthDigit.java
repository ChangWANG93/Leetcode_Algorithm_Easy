
public class Solution400NthDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000000000;
        int i=0;
        int s=0;
        int sum=0;
        while(sum<n ){
        	//sum=sum+s;
        	s=(int) (9*(Math.pow(10, i)*(i+1)));
        	sum=sum+s;
        	i=i+1;    	
        	if(sum<0) break;
			System.out.println("sum"+sum);	
        	System.out.println("s"+s);	
	}
       System.out.println("i:"+i);
       
       int diff=(int) (n-sum+s-1);
       int count=diff/i;  // int mod=diff%i;   //the nth number of the sequence with the length i
       int nth=(int) (Math.pow(10, i-1))+count;
       String num=nth+"";
       int loc;  //location in the particular number
      // if (diff%i==0){loc=i-1;}   else{loc=diff%i-1;} 
       loc=diff%i;
       int result=num.charAt(loc)-'0';
       
       
       
       //	System.out.println("sum:"+sum);	
        System.out.println("diff:"+diff);
        System.out.println("count:"+count);
      //  System.out.println("mod:"+mod);	
        System.out.println("loc:"+loc);
        System.out.println("nth:"+nth);
        System.out.println("result:"+result);        
        
	}

}
