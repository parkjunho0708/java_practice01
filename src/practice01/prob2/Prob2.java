package practice01.prob2;

public class Prob2 {
	public static void main (String args[]) {
		int[][] arr = new int[9][10];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length ; j++) {
				arr[i][j]=i+j+1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
