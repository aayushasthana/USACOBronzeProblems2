import java.util.*;
import java.io.*;

public class TheBucketList {

	public static void main(String[] args) throws Exception {
		bl b = new bl();
		b.algo();
	}

}

class bl {
	int N;
	ArrayList<Boolean> buckets;
	int[][] cows;
	Scanner sc;
	PrintWriter w;
	
	
	bl() throws Exception {
		sc = new Scanner(new File("blist.in"));
		w = new PrintWriter(new File("blist.out"));
	}
	
	void algo() {
		getInputs();
		
		for (int time=1; time<1001; time++) {
			for (int i=1; i<N+1; i++) {
				if (cows[i][0] == time) {

					
					for (int j=0; j<buckets.size(); j++) {
						if (buckets.get(j) == true) {
							
						}
					}
					
					
				}
				
				if (cows[i][1] == time) {
					
				}
			}
		}
	}
	
	void getInputs() {
		N = sc.nextInt();
		buckets = new ArrayList<Boolean>();
		cows = new int[N+1][3];
		
		cows[0][0] = -1;
		cows[0][1] = -1;
		cows[0][2] = -1;
		
		for (int i=1; i<N+1; i++) {
			cows[i][0] = sc.nextInt();
			cows[i][1] = sc.nextInt();
			cows[i][2] = sc.nextInt();
		}
		
		for (int i=0; i<N+1; i++) {
			System.out.println(cows[i][0]);
			System.out.println(cows[i][1]);
			System.out.println(cows[i][2]);
		}
	}
}