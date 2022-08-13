package star_patern;

public class Smaple_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //    *
		   //   * *
		  //   * * *
		 //   * * * * 
		
		//row 1; col=4; star 1;
		int star =1;
		int space=3;
		for(int i=1;i<=4;i++)
{
			for(int j=1; j<=space;j++)
			{
				System.out.println(" ");
				}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println( );
			star++;
			space--;
		}
		
		
		int space1=3;
		int star1=1;
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=space1;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
		System.out.print("* ");
		}
		System.out.println();
		star1++;
		space1--;
		}
	}

}
