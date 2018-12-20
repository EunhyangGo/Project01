package com.biz.project.leep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.project.method.LeepMethod;

public class LeepYear04 {
	public static void main(String[] args) {
		String strFileName = "src/com/biz/project/윤년List.txt";
		
	
		FileReader fr;
		BufferedReader buffer;

		LeepMethod lm = new LeepMethod();
		
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
		
			while(true) {
			String reader = buffer.readLine();
			if(reader == null) break;
			
			// 1번 split을 이용
			String[] dates = reader.split(":");
			int intYear = Integer.valueOf(dates[0]);
			
			// 2번 subString을 이용
			String strYear = reader.substring(0, 4);
			intYear = Integer.valueOf(strYear);
			
			if(lm.isLeepYear(intYear)) {
				System.out.println(reader + "은 윤년");
			}else {
				System.out.println(reader + "은 평년");
			}
		}
					buffer.close();
					fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
