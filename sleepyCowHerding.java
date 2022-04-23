import java.util.*;
import java.io.*;

public class sleepyCowHerding {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("herding.in"));
		PrintWriter w = new PrintWriter("herding.out");
		
		//Get Inputs
		ArrayList<Integer> cows = new ArrayList<Integer>();
		for (int i=0; i<3; i++) {
			cows.add(sc.nextInt());
		}
		
		
		
		sc.close();
		w.close();
	}

}
