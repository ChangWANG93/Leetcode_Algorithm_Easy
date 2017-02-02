import java.util.ArrayList;
import java.util.List;
public class Solution412FizzBuzz {
	public static void main (String[] args ) {
	int n=15;
	List<String> list=new ArrayList<String>();    
	for(int i=1;i<=n;i=i+1){
	    	if(i%3==0&&i%5==0) {
	    	    list.add("\""+"FizzBuzz"+"\",\n");}
	    	//list.add("FizzBuzz");}
		    else if(i%3==0){
			    list.add("\""+"Fizz"+"\",\n");}
	    	//list.add("Fizz");}
		    else if(i%5==0){
			    list.add("\""+"Buzz"+"\",\n");}
	    	//list.add("Buzz");}
		    else {
			    list.add(i+"");}//list.add(String.valueOf(i));   
	        }
    String completeString = list.toString();
	System.out.println(list);
    //return list;
}
}