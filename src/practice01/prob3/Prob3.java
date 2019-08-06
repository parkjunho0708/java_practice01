package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int oddEvenNum = scanner.nextInt();
		int initialNum;
		int initialSum = 0;
		
		if (oddEvenNum % 2 == 0) {
			// 짝수
			for (initialNum = 2; initialNum <= oddEvenNum; initialNum++) {
				if (initialNum % 2 == 0) {
					initialSum = initialSum + initialNum;
				}
			}
		} else {
			// 홀수
			for (initialNum = 1; initialNum <= oddEvenNum; initialNum++) {
				if (initialNum % 2 == 1) {
					initialSum = initialSum + initialNum;
				}
			}
		}
		System.out.println("결과 값 : " + initialSum);

	}
}
