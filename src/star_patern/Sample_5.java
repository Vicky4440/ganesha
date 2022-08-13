package star_patern;

public class Sample_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *
		// ***
		// *****
		// *******
		
		
		//star=1;row=4;col=7; space=3
		int star=1;
			int 	space=3;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star= star+2;
			space--;
		}
		
	}

}
