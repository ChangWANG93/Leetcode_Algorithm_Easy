import java.util.*;

public class Solution349IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1={1,2,2,1,3,2,1,4};
		int [] nums2={2,2};
		Set<Integer> set1=new HashSet<>();
		//Set set1=new HashSet();
		for(int i=0;i<nums1.length;i++){
			set1.add(nums1[i]);
		}
		Set<Integer> set2=new HashSet<>();
		//<Integer> list= new ArrayList<>();
		for(int i=0;i<nums2.length;i++){
			if(set1.contains(nums2[i])){
				set2.add(nums2[i]);
			}
		}
		int k=0;
		int [] intersect=new int[set2.size()];
		for(Integer num:set2){
			intersect[k++]=num;
			//k=k+1;
		}
		
		
		
		System.out.println(Arrays.toString(intersect));
		//System.out.println(intersect.toString());
		
		//System.out.println(list.toArray());
		
	}
}







/*int t1=nums1[0]-1;
ArrayList<Integer> l1= new ArrayList<>();
l1.add(nums1[0]);
for(int i=1;i<nums1.length;i++){
	t1=nums1[i-1]^nums1[i];
	if(t1!=0){l1.add(nums1[i]);}	
	}
ArrayList<Integer> l2= new ArrayList<>();
l2.add(nums2[0]);
for(int i=1;i<nums2.length;i++){
	t1=nums2[i-1]^nums2[i];
	if(t1!=0){l2.add(nums2[i]);}	
	}

Integer[] list1=new Integer[l1.size()];
list1=(Integer[])l1.toArray(list1);
//list1.toString();
System.out.print(Arrays.toString(list1));

Integer[] list2=new Integer[l2.size()];
list2=(Integer[])l2.toArray(list2);
//list2.toString();
System.out.print(Arrays.toString(list2));
System.out.print(list1[0]);

ArrayList<Integer> l3= new ArrayList<>();
int m=0,n=0;
for(m=0;m<list1.length;m=m+1){
	for(n=0;n<list2.length;n=n+1);{
		if(list1[n]==list2[m]){l3.add(Integer.valueOf(list1[n]));}
	}
	}
Integer[] list3=new Integer[l3.size()];
list3=(Integer[])l3.toArray(list3);

System.out.print(Arrays.toString(list3));	*/    