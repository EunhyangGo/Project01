package com.biz.project;

import java.util.Scanner;

public class project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intYear = 2018;
		boolean leepOk = false; // falg변수
		
		//윤년인지 검사
		if(intYear % 4 == 0) {
			leepOk = true;
			if(intYear % 100 == 0) {
				leepOk =false;
				if(intYear % 400 == 0) {
					leepOk = true;
				}
			}
		}
		if(leepOk) {
			System.out.println("윤년");
			
		}else {
			System.out.println("평년");
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연도를 입력하세요 >>");
			String strYear = sc.nextLine();
			
			int intYear = Integer.valueOf(strYear);
			if(intYear % 4 ==0 && intYear%100==0 || intYear % 400 == 0) {
				
				System.out.println(intYear +" 년은 윤년입니다");
				
			}else {
				System.out.println(intYear + "년은 윤년이 아닙니다.");
			}
			
		}
		
	
*/
}
}