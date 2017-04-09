package proxypattern;

public class RealIntranetAccess implements IntranetAccess {
	
	private String studentName;
	
	public RealIntranetAccess(String studentName) {
		this.studentName = studentName;
	}
	
	public void grantIntranetAccess() {
		System.out.println("Access granted to " + studentName);
	}
	
}
