package star_patern;

public class Smaple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *******
		// *****
		// ***
		// *
         // row=4;col=7;star=7;space=0
		
		
		int star=1;
		int space=6;
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
		
		
		
		
		
	}

}
