package question08;

public class Student {
	private String name;
	private int number;
	private String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return("이름: "+name+"\n학번: "+number+"\n소속학과: "+department+"\n");
	}
//	public static void toString(Student s) {
//		System.out.println("이름: "+s.getName());
//		System.out.println("학번: "+s.getNumber());
//		System.out.println("소속학과: "+s.getDepartment()+"\n");
//	}
}
