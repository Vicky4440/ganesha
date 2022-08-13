package logical;

import java.util.HashMap;
import java.util.Scanner;

public class All_Methds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
//	Scanner sc= new Scanner(System.in);
//	System.out.println("give int");
//	int a= sc.nextInt();
//		int count=0;
//		for(int i=2;i<=a/2;i++) {
//			if(a%i==0) {
//				count++;
//			}
//			
//		}
//		if(count==0) {
//			System.out.println("it is prime no");
//		}
//		else {
//			System.out.println("it is not prime no");
//		}
//		System.out.println("======================================");
//		
//		System.out.println("input int value B");
//		int b=sc.nextInt();
//		System.out.println("input int value C");
//		int c= sc.nextInt();
//		if(b%c==0) {
//			System.out.println("this even no");
//		}
//		else {
//			System.out.println("This is odd no");
//		}
		
		
		//oddno
		
		
		
		
//		
//		int a[]= {1,2,3,4,5,6};
//		for (int i=0;i<=a.length;i++) {
//			//reminder is not 0 then odd
//			if(a[i]%2!=0) {
//				System.out.println(a[i]);
//				System.out.println("**********");
//			}
			
//			for (int j=0;j<=a.length;j++) {
//				//reminder is  0 then even
//				if(a[j]%2==0) {
//					System.out.println(a[j]);
//			
//		}
//				
//				
//				
//		
//	}
//		}
		
		
		
		
		
		
		
		//prime no
//		
//		int a=29;
//		int count=0;
//		for (int i=2;i<a;i++) {
//			
//			if(a%i==0) {
//				count++;
//			}
//			
//		}
//		if(count==0) {
//			System.out.println("this is prime no");
//		}
//		else {
//			System.out.println("this is not prime no");
//		}
		
		
		//find duplicate array
		
//		int []as= {1,2,2,45,7,8,6,6,4,7};
//		HashMap<Integer, Integer>hd=new HashMap<Integer,Integer>();
//		
//		for( int vp:as) {
//			
//			if(hd.containsKey(vp)) {
//				
//				hd.put(vp, hd.get(vp)+1);
//			}
//			else {
//				hd.put(vp,1);
//				
//			}
//			
//			
//		}
//		System.out.println(hd);
//		
//		
		
		
		
		// find missing array
		
//		int []num= {1,2,4,5};
//		
//		int star;
//		star=num[0];
//		
//		for(int i=1;i<=num.length;i++) {
//			
//			if(num[i]==(star+1)) {
//				
//		 star=num[i];
//			}
//			else {
//				System.out.println("missing no is "+(star+1));
//				break;
//			}
//			
//			
//		}
//		
		
		//duplicates array
		
//		String []arr= {"vikram", "vikram", "vicky"};
//		
//		
//		HashMap<String, Integer>hs=new HashMap<String,Integer>();
//		
//		
//		for(String vp:arr) {
//			
//			if(hs.containsKey(vp)) {
//				hs.put(vp, hs.get(vp)+1);
//				
//			}
//			else {
//				hs.put(vp, 1);
//			}
//		}
//		System.out.println(hs);
		
		
		//find out missing value
//		
//		int arr[]= {1,2,3,5};
//		
//		int star=0;
//		star=arr[0];
//		for(int i=1;i<=arr.length;i++) {
//			if(arr[i]==(star+1)) {
//				star=arr[i];}
//				else {System.out.println("missing no "+(star+1));
//				break;
//				}
//			
//			}
		
//		int j = 1, num1 = 4;  
//		while (++j <= 10)  
//		{  
//		  num1++; 
//		  
//		}  System.out.println(num1);
//		
//		
		
//		
//	int arr[]= {1,2,3,4,5,6,8	};
//	int sum=0;
//	int sum1=0;
//	//1+2+3+5=11
//	//we want write complete sequence that why we are use anothr for loop//1+2+3+4+5+6+7+8=15	
//	//15-11=4	
//	for(int i=0; i<=arr.length-1;i++)	{
//		sum=sum+arr[i];
//		//1
//		//1+2=3
//		//3+3=6
//		//6+5=11
//	}
//		System.out.println(sum);
//		//
//	for(int i=1;i<=8;i++) {
//		sum1=sum1+i;
//		//sum1=1//sum1=1+2=3//6//10//15
//		
//	}	
//		System.out.println(sum1);
//		System.out.println("missinng no "+(sum1-sum));
//		
		// prime no
		
		
		int sum=23;
		int count=0;
		for(int i=2; i<=sum;i++) {
			if(i%sum==00) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("This is prime no");
		}
		else {
			System.out.println("This is not prime no");
		}
		
		
		
	}
}