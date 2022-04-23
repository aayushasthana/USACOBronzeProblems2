import java.util.*;
import java.io.*;

public class Censoring {

	public static void main(String[] args) throws Exception {
		cen c = new cen();
		c.algo();
	}

}

class cen {
	Scanner sc;
	PrintWriter w;
	String oS;
	String bW;
	char[] originalString;
	char[] badWord;
	String temp;
	int index;
	int tempindex;
	
	cen() throws Exception {
		sc = new Scanner(new File("censor.in"));
		w = new PrintWriter("censor.out");
	}
	
	void algo() {
		getInputs();
		
		for (int i=0; i<oS.length(); i++) {
			
			index = oS.indexOf(bW);
			
			if (index == -1) {
				w.println(oS);
				break;
			}
			
			temp = bW.substring(index-bW.length(), index+bW.length());
			
		}
	}
	
	void getInputs() {
		oS = sc.next();
		bW = sc.next();
		
		originalString = oS.toCharArray();
		badWord = bW.toCharArray();
	}
}