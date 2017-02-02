import java.util.*;
public class Solution415AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String num1="408";
			String num2="5";
			int l1=num1.length();
			int l2=num2.length();
			int max=Math.max(l1, l2);
			int min=Math.min(l1, l2);
			//int s=0; 
			int c=0;
			String r="";
			for(int i=0;i<max;i++){
				if(i<min){
				int n1=num1.charAt(num1.length()-1-i)-'0';
				int n2=num2.charAt(num2.length()-1-i)-'0';
				int sum=n1+n2+c;
				if (sum>=10){c=1;sum=sum-10;}
				else{sum=sum;c=0;}
				r=sum+r;}
				if(i>=min){
					if(l1>l2){
							int n1=num1.charAt(num1.length()-1-i)-'0';
							int n2=0;
							int sum=n1+n2+c;
							if (sum>=10){c=1;sum=sum-10;}
							else{sum=sum;c=0;}
							r=sum+r;}

					if(l1<l2){
						int n1=0;
						int n2=num2.charAt(num2.length()-1-i)-'0';
						int sum=n1+n2+c;
						if (sum>=10){c=1;sum=sum-10;}
						else{sum=sum;c=0;}
						r=sum+r;}
						}
				}

			if(c==1){r=1+r;}
			
			System.out.println(r);
							}
}

/*String num1="12345";
String num2="1";
int l1=num1.length();
int l2=num2.length();
int max=Math.max(l1, l2);
int min=Math.min(l1, l2);
int s=0; 
int c=0;
ArrayList <Integer> l= new ArrayList<>();
for(int i=0;i<max;i++){
	int n1=num1.charAt(num1.length()-1-i)-'0';
	int n2=num2.charAt(num2.length()-1-i)-'0';

	if(i<min){
	int n1=num1.charAt(num1.length()-1-i)-'0';
	int n2=num2.charAt(num2.length()-1-i)-'0';
	int sum=n1+n2;
	if (sum>=10){c=1;s=sum-10;}
	else{s=sum;}
	l.add(0,s);}
	if(i>=min){
		if(l1>l2){
				int n1=num1.charAt(num1.length()-1-i)-'0';
				int n2=0;
				int sum=n1+n2;
				if (sum>=10){c=1;s=sum-10;}
				else{s=sum;}
				l.add(0,s);}

		if(l1<l2){
			int n1=0;
			int n2=num2.charAt(num2.length()-1-i)-'0';
			int sum=n1+n2;
			if (sum>=10){c=1;s=sum-10;}
			else{s=sum;}
			l.add(0,s);}
			}
	}
System.out.println(result);
System.out.println(l.toString());
*/


/*int l1=num1.length();
int l2=num2.length();
int max=Math.max(l1, l2);
int min=Math.min(l1, l2);
int s=0; 
int c=0;
String r="";
//ArrayList <Integer> l= new ArrayList<>();
int sum=0;
for(int i=0;i<min;i++){
	int n1=num1.charAt(num1.length()-1-i)-'0';
	int n2=num2.charAt(num2.length()-1-i)-'0';
	sum=n1+n2+c;
	if (sum>=10){c=1;s=sum-10;}
	else{c=0;s=sum;}
	r=sum+r;
	}
for(int i=min;i<max;i++){
		if(l1>l2){
				int n1=num1.charAt(num1.length()-1-i)-'0';
				int n2=0;
				sum=n1+n2+c;
													}

		if(l1<l2){
			int n1=0;
			int n2=num2.charAt(num2.length()-1-i)-'0';
			sum=n1+n2+c;}
			if (sum>=10){c=1;s=sum-10;}
			else{s=sum;c=0;}
			r=sum+r;
			}
//if(c==1){r=1+r;}

System.out.println(r);
*/