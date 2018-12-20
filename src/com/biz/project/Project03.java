package com.biz.project;

import java.io.FileWriter;

public class Project03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strFileName  = "D:/bizwork/workspace/참고자료/급여명세.txt";
		
		FileWriter fr;
		
		try {
			fr = new FileWriter(strFileName);
			int intPay = 2357500;
			int intPaper = 50000;
			int count = 0;
			int index = 0;
			
			while(intPay > 0) {
				
				count = intPay / intPaper ;
				intPay -= (intPaper * count);
				System.out.println(intPaper + "원권:" + count);
				
				// 만약 intPay가 0이 되어서
				// 더이상 화폐매수를 계산할 필요가
				// 없을때 그만 계산하라..
//				if(intPay <= 0) break ; // 중단
				
				if(index++ % 2 == 0) intPaper /= 5;
				else intPaper /= 2;
			
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	

}
