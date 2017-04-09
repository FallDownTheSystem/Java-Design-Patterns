package proxypattern;

import java.util.HashMap;
import java.util.Map;

public class RealStudentIDAccess implements StudentIDAccess {
	
	Map<String, String> studentMap = new HashMap<String, String>();
	String studentID;
	String studentName;
	
	public RealStudentIDAccess(String studentName, Map studentMap) {
		this.studentName = studentName;
		this.studentID = (String)studentMap.get(studentName);
	}
	
	@Override
	 public void grantStudentIDAccess() {
		 System.out.println("Student id of " + studentName + " is " + studentID);
	 }
}
