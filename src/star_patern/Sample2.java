package star_patern;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //*****
		//*/***
		//*/**
		//*/*
		//*
		//row 5;col 5;star 5
		int star=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			
		}
		
		
		
	}

}
