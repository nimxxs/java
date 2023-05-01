package day05;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		// array : 순서를 매기는 것
		// 인덱스 0부터 시작함
		// 인덱스에 해당하는 데이터가 있음 (ex, class01[0]="정진영"; class01[1]="안현우")
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		System.out.println("양수 5개를 입력해주세요.");
		for(int i=0; i<5; i++) {
			intArray[i]=scanner.nextInt();
//			System.out.println(intArray[i]);
			if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		System.out.println("입력하신 숫자 중에 가장 큰 숫자는 "+max+"입니다.");
		scanner.close();			// 스캐너 꼭 안닫아줘도 에러는 안뜸
		
	}
}
