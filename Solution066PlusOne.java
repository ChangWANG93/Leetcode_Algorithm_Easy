import java.util.*;
public class Solution066PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits={1,2,3,4,9};
		ArrayList<Integer> l=new ArrayList<>();
		int c=0;
		int s=0;
		int last= digits[digits.length-1]+1;
		
		if(last==10){l.add(0,0);c=1;}
		else {l.add(0,last);c=0;}
		
        for(int i=1;i<digits.length;i++){
        	s=digits[digits.length-i-1]+c;
        	if(s==10){l.add(0,0);c=1;}
        	else if(s<10){l.add(0,s);c=0;}	
        }    
		if(c==1){l.add(0,1);}
		int [] arr=new int[l.size()];
		int k=0;
		for(int num:l){
			arr[k++]=num;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(l);
		
	}

}
/*int[] digits={9,2,3,4,9};
int c=0;
int l=digits.length-1;
if(digits[l]!=9){digits[l]=digits[l]+1;}
else{
	digits[l]=0;
	c=1;
	 for(int i=1;i<digits.length;i++){
        	digits[l-i]=digits[l-i]+c;
        	if (digits[l-i]==9){c=1;}
        	else{c=0;}
	 
	 }
}
int [] arr;
if(digits[0]==0){
	arr=new int[l+1];
	int k=1;
	arr[0]=1;
	for(int num:digits){
		arr[k++]=num;
}
	System.out.println(Arrays.toString(arr));

}
*/