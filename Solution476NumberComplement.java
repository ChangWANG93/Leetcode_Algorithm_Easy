
public class Solution476NumberComplement {

	public static void main(String[] args) {
	int num=2147483647;    //expected=0;
	//int num=2147483646    //expected=1;

	//int num=5;
	int i=0;
	int x=num;
	while(x>1){
		i=i+1;
		x=x/2;
	}
	double t=Math.pow(2,i+1);
	int c=(int)Math.round(t);
	int complement = c-num-1;
	System.out.println(c);
	System.out.println(complement); 	
	//return(complement);
	}
}
