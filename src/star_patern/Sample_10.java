package star_patern;

public class Sample_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5; int clm=9;
		int star1=1 , space1=0;
		int star2=1 , space2=4;
		
		for(int i=0; i<=row; i++ )
		{
			for(int k=0; k<star1; k++)
			{
				System.out.print("*");
				
			}
			for(int j=0; j<space1; j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=0; j<space2; j++)
			{
				System.out.print(" ");
				
			}
		
			
			for(int k=0; k<star2; k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			if(i<4) {
				star1++;
			space1--;
			star2++;
			space2--;}
			
			else{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			
	}

}
}
