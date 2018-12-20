package com.biz.project.leep;

import com.biz.project.method.LeepMethod;

public class LeepYear02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeepMethod lm = new LeepMethod();
		for(int i = 1980; i < 2000; i++) {
			boolean b = lm.isLeepYear(i);
			// b가 boolean형 이므로 b==true라고 쓰지 않아도 된다.
			if(b) {
				System.out.println(i+ "는 윤년");
				
			}
		}
	}

}
