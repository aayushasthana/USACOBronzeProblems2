public class WolfSheepCabbage {
	
	
	public static void main(String[] args) {
		simulate(true, true, true, 0);
	}
	
	public static boolean simulate(boolean wolf, boolean sheep, boolean cabbage, int depth) {
		if (depth > 6) {
			return false;
		}
		
		else if (wolf && sheep && cabbage && depth%2 == 1) {
			System.out.println("Done");
			return true;
		}
		
		else if (wolf == sheep & sheep == false) {
			return false;
		}
		
		else if (cabbage == sheep & sheep == false) {
			return false;
		}
		
		else if (simulate(!wolf, !sheep, !cabbage, depth+1)) {
			System.out.println("move boat");
			return true;
		}
		
		else if (wolf && simulate(wolf, !sheep, !cabbage, depth+1)) {
			System.out.println("move wolf");
			return true;
		}
		
		else if (sheep && simulate(!wolf, sheep, !cabbage, depth+1)) {
			System.out.println("move sheep");
			return true;
		}
		
		else if (cabbage && simulate(!wolf, !sheep, cabbage, depth+1)) {
			System.out.println("move cabbage");
			return true;
		}
			
		else {
			return false;
		}
		
	}
}
