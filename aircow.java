import java.util.*;

public class aircow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int steps = 0;
		ArrayList<Integer> goal = new ArrayList<Integer>();
		ArrayList<Integer> initial = new ArrayList<Integer>();
		
		for (int i=0; i<N; i++) {
			goal.add(sc.nextInt());
		}
		
		for (int i=0; i<N; i++) {
			initial.add(sc.nextInt());
		}
		
		sc.close();
		
		ArrayList<Integer> diff;
		ArrayList<Integer> sectionIndexs;
		boolean solved = false;
		int diffMost;
		
		
		/* pseudo code
		 * stop= false;
		 * while(stop == false)
			 * re-find the diff-array
			 * re-find the sections from the diff array
			 * if (all zeros in diff array)
			 * 		stop = true
			 * else:
			 * 		for each section
			 * 			find the max diff within section
			 * 			change initial array by max diff
			 * 			increment the step_count
			 * 
		*/
		
		
		//while (!solved) {
			diff = new ArrayList<Integer>();
			sectionIndexs = new ArrayList<Integer>();
			
			//find diff array
			for (int i=0; i<N; i++) {
				diff.add(initial.get(i)-goal.get(i));
			}
			// find sections from the diff arr
			for (int i=0; i<N; i++) {
				if (diff.get(i) == 0) {
					sectionIndexs.add(i);
				}
			}
			
			// for each section 
			for (int i =0; i< sectionIndexs.size();i++) {
				// find max diff
				if (Math.abs(Collections.max(diff)) > Math.abs(Collections.min(diff))) {
					diffMost = 0 - Collections.max(diff);
				}
				
				else {
					diffMost = Collections.min(diff);
				}
				
			}
			
			
			
			// one step to change the temp
			for (int i=sectionIndexs.get(0); i<N; i++) {
				initial.set(i, initial.get(i) + diffMost);
			}
			
			steps += diffMost;
			
		//}
		
		
 	}

}
