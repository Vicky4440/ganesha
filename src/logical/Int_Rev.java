package logical;

public class Int_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int a=12345;
//		String re = Integer.toString(a);
//		String rev= " ";
//		for (int i=re.length()-1; i>=0;i--) {
//			rev=rev+re.charAt(i);
//		}
//		System.out.println(rev);//convert string to int
//		int num = Integer.parseInt(rev);
//		System.out.println(num);
		
		
		
		
		int num= 123;
		// to convert int to String
		String orignal = Integer.toString(num);
		String rev="";
		for(int i=orignal.length()-1;i>=0;i--)
		{
		rev=rev+orignal.charAt(i);
		}
		System.out.println(rev);// here rev is in String format
		int revNum = Integer.parseInt(rev);
		//System.out.println("Orignal Number is "+num);
		System.out.println("Reverse Number is "+revNum);
	}

}
