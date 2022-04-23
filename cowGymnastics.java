import java.util.*;
import java.io.*;

public class cowGymnastics {

	public static void main(String[] args) throws Exception {
		gym g = new gym();
		g.algo();
	}

}

class gym {
	Scanner sc;
	PrintWriter w;
	int K;
	int N;
	int[][] sessions;
			
	gym() throws Exception {
		sc = new Scanner(new File("gymnastics.in"));
		w = new PrintWriter("gymnastics.out");
	}
	
	void algo() {
		
	}
	
	void getInputs() {
		K = sc.nextInt();
		N = sc.nextInt();
		sessions = new int[K+1][N+1];
		
		for (int i=1; i<K+1; i++) {
			for (int j=1; j<N+1; j++) {
				sessions[i][j] = sc.nextInt();
			}
		}
		
		
	}
}
