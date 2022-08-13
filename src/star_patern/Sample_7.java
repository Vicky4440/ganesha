package star_patern;

public class Sample_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//    *
				//   * *
				//  * * *
				// * * * *
               // * * * * *
		        // * * * *
	            //  * * *
	            //   * *
             //	      *	
		
		//row =10;col=5;star=1;space=4;
				int star= 1;
				int space= 4;
				for(int i=1;i<=10;i++) {
					for(int j=1;j<=space;j++) {
						System.out.print(" ");
					}
					for (int k=1;k<=star;k++) {
						System.out.print("* ");
					}
					System.out.println();
				if(i<5) {
					star++;
						space--;				}
//					else {
//						star--;
//						space++;
//					}
				}
	}

}
