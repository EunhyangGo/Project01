package com.biz.project.method;

public class LeepMethod {
	
	public boolean isLeepYear(int intYear) {
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
		return leepOk;	
	}

}
