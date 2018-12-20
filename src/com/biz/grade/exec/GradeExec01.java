package com.biz.grade.exec;

import com.biz.grade.service.GradeService01;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String scoreFile = "src/com/biz/grade/점수표.txt";
		String stdFile = "src/com/biz/grade/학생리스트.txt";
		String gradeFile = "src/com/biz/grade/성적표정리.txt";
		
		String [] files = {stdFile, scoreFile, gradeFile};
		
		GradeService01 gs = new GradeService01(files);
		
		gs.stdFileRead();
		gs.scoreFileToList();
		gs.stdMatchScore();

		gs.viewScore();
		gs.writeScore();
	}

}
