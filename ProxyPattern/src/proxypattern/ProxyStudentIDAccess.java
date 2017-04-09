package proxypattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyStudentIDAccess implements StudentIDAccess {
	
	Map<String, String> studentMap;
	private String studentName;
	private String studentID;
	
	public ProxyStudentIDAccess(String studentName, Map studentMap) {
		this.studentName = studentName;
		this.studentID = (String)studentMap.get(studentName);
		this.studentMap = studentMap;
	}
	
	@Override
	public void grantStudentIDAccess() {
		
		if (getStudentID()) {
			RealStudentIDAccess realIDAccess = new RealStudentIDAccess(studentName, studentMap);
			realIDAccess.grantStudentIDAccess();
		} else {
			System.out.println("You don't have access to a student ID.");
		}
	}
	
	public boolean getStudentID() {
		return studentMap.containsKey(this.studentName);
	}
	
}
