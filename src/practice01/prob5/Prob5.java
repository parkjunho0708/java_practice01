package practice01.prob5;

public class Prob5 {
	public static void main(String args[]) {
		for (int i = 1; i < 100; i++) {
			int s1 = i / 10;
			int s2 = i % 10;
			int clapNumber = 0;
			
			if((s2 == 3 || s2 == 6 || s2 == 9))
				clapNumber++;
			if((s1 == 3 || s1 == 6 || s1 == 9))
				clapNumber++;
			
			if(clapNumber == 1) {
				System.out.println(i + " 짝");
			}else if(clapNumber == 2) {
				System.out.println(i + " 짝짝");
			}
		}
	}
}
