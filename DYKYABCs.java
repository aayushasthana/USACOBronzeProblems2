import java.util.*;

public class DYKYABCs {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=0; i<7; i++) {
			numbers.add(sc.nextInt());
		}
		
		sc.close();
		
		Collections.sort(numbers);
		int A = numbers.get(0);
		int B = numbers.get(1);
		int ABC = numbers.get(6);
		
		int C = ABC - A - B;
	
		System.out.println(A + " " + B + " "+ C);
	}

}
