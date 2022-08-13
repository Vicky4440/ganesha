package logical;

public class Int_Reverse_Without_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int num=123;
//		int rev=0;
//		for(int i=num;i>=0;i=i/10) {
//			
//			int rem=i%10;//1234%10=4;123%10=3;12%10=2;1%10=1
//			
//			rev =(rev*10)+rem;
//			//0*10+4=4;
//			//4*10+3=43;
//			//      =432;
//			//      =4321;
//		}
//		System.out.println(rev);
		
		
		
		//odd or even
		
//		int a=40;
//		
//		if(a%2==0) {
//			System.out.println("even no");
//		}
//		else {System.out.println("odd no");}
//		
//		int a=173;
//		int fact=0;
//		for(int i=a;i>=0;i=i/10) {
//			
//			int rev=i%10;
//			fact=fact+(rev*rev*rev);
//		}
//		System.out.println(fact);
//		
//		if(a==fact) {
//				System.out.println("armstrong");
//		}
//		else {System.out.println("not a armstrong");}
//		
//		
		
		//371
		//3^3+7^3+1^3==371--> armStrong number
		int a=37;
		int num=0;
		// System.out.println(3/10);371//37//3
		//System.out.println(3%10);//1,7,3
		for(int i=a;i>0;i=i/10)
		{
		int num1=i%10;
		num=num+(num1*num1*num1);
		}
		System.out.println("orignal number is "+a);
		System.out.println("addition of digits cube is "+num);
		if(a==num)
		{
		System.out.println("given number is ArmStrong Number");
		}
		else {
		System.out.println("given number is not ArmStrong Number");
		}

	}

}
