package com.biz.project;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		for(int i =0 ; i<100; i++) {
			if(i % 2 ==0) {
				intSum+=1;
			}
		}
		System.out.println(intSum);
	}
}

