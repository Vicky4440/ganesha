package logical;

public class Fibona_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prev,next,sum;
		prev=next=1;
		System.out.println(prev+" ");
		for(int i=0;i<=10;i++) {
			sum=prev+next;
			prev=next;
			next=sum;
			System.out.println(sum);
		}
	}

}
