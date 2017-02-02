
public class Solution263UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-2147483648;
		//int x=0;
		int num1=0;int num2=0;int num3=0;
		while(num>1){
			//num1=num/5;
			//num2=num/3;
			//num3=num/2;
			System.out.println("n:"+num);
			if (num%5==0){ num=num/5;System.out.println("1n:"+num);  }
			else if (num%3==0){num=num/3;System.out.println("2n:"+num); }
			else if (num%2==0){num=num/2;System.out.println("3n:"+num); }
			else{num=0;}
					}
		System.out.println(num==1);
	}

}
