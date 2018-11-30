package com.methodRef;

public class Session3 {

	public static void main(String[] args) {

		//No args 
	/*TeacherInfoItraf tInfo = Teacher::new ;
	 tInfo.getInfo(); */
		
		// with args
		
		TeacherInfoItraf tItraf = Teacher::new;
		tItraf.getInfo("Durga Sir");

	}

}
