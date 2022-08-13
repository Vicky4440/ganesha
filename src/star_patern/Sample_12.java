package star_patern;

public class Sample_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*
		//***
		//*****
		//*******
		//*****************
		
		
	int row=5;
	int star=1;
	int space=0;
	int space1=8;
	int star1=1;
	for(int i=1;i<=row;i++) {
//		for(int j=1;j<=space;j++) {
//			System.out.print("");
//		}
		for(int j=1;j<=space1;j++) {
			System.out.print(" ");
		}
		
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println();
		star=star+2;
		space1=space1-2;
	}
	
		
		
		
		
		
		
		
		
	}

}
