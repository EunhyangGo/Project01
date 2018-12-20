package com.biz.project.money;

import com.biz.project.service.MoneyService;

public class Money01 {
	
	public static void main(String[] args) {
		int nMoney = 3949203;
		
		// 우리나라의 통화는 5만원~ 10원권까지 존재한다.
		// nMoney를 5만원 까지 최소수량으로 지급하고자 할때
		// 각 통화 단위별로 매수를 계산하여 급여명세.txt에 저장하라.
		String file = "src/com/biz/exam/money/급여명세.txt";
		MoneyService ms = new MoneyService();
		//ms.makerpager(nMoney);
		ms.makePaperBoolean(nMoney);
		ms.viewPaper2();
		ms.writerPaper(file);
	}
	

}
