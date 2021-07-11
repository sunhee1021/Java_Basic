package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
	
	public Emp(int empno, String ename) {

		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//Object가 가지는 함수 재정의
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	//Object toString 원하면 이거 재정의 해서 써
	//개발자가 하는(toString) 재정의 -> 멤버필드의 값을 확인하는 용도로 많이씀
	
}
