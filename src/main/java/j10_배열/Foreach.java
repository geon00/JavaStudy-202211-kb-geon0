package j10_배열;

import java.util.*;
import java.util.Collections;

public class Foreach {

	static int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static int[] array2 = new int[] { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
	
	static List dupMinList = new ArrayList<>(); // 중복된 값 리스트
	static List unDupMaxList = new ArrayList<>(); // 중복되지 않은 값 리스트

	public static void main(String[] args) {
		getResult(); // 메소드 리스트
	}

	public static void getResult() {
		for (int num : array1) {
			for (int num2 : array2) { // 두 배열간 모든값 비교 (예제 : 구구단)
				if (num == num2) {
					dupMinList.add(num); // 두값이 같을시 중복된 값 추가
				} else {
					if (num > num2) {
						unDupMaxList.add(num); // 두값이 다를시 비교후 큰 값 추가 (제일 큰값 구하기 위해)
					} else {
						unDupMaxList.add(num2);
					}
				}
			}
		}
		System.out.println(Collections.min(dupMinList));
		System.out.println(Collections.max(unDupMaxList));
	}
}