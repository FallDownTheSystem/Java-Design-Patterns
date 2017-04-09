package proxypattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProxyIntranetAccess implements IntranetAccess {
	
	private String studentName;
	private String studentID;
	private StudentIDAccess idProxy;
	private ArrayList<String> studentList;
	private Map<String, String> studentMap;

	public ProxyIntranetAccess(String studentName, ArrayList<String> studentList) {
		this.studentName = studentName;
		this.studentList = studentList;
		this.studentMap = new HashMap<String, String>();
		
		Random rnd = new Random();
		studentID = Integer.toString(100000 + rnd.nextInt(900000));
		
		studentList.forEach((name) -> {
			this.studentMap.put(name, studentID);
		});
		
	}
	
	@Override
	public void grantIntranetAccess() {
		
		if (getStudent()) {
			RealIntranetAccess realIntraAccess = new RealIntranetAccess(studentName);
			realIntraAccess.grantIntranetAccess();
			idProxy = new ProxyStudentIDAccess(studentName, studentMap);
		} else {
			System.out.println("Not a student, intranet access denied");
		}
	}
	
	public void printStudentID() {
		if (idProxy == null) {
			System.out.println("You must login first.");
		} else {
			idProxy.grantStudentIDAccess();
		}
	}
	
	
	public boolean getStudent() {
		return studentList.contains(studentName);
	}
}
