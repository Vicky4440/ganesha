package HAsh;

import java.util.HashMap;

public class HASH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,1,2,3,4,5};

    HashMap<Integer, Integer>hs=new  HashMap<Integer,Integer>();

    
    for ( int vp:a) {
    	if(hs.containsKey(vp)) {
    		
    		hs.put(vp, hs.get(vp)+1);
    	}
    	else {
    		hs.put(vp, 1);
    	}
    }
 System.out.println(hs);
}

}
