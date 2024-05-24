package question08;

public class StudentDriver {
	public static void main(String[] args) {
	Student student1 = new Student();
	student1.setName("갑돌");
	student1.setNumber(100);
	student1.setDepartment("컴퓨터공학과");
	System.out.println(student1);//.toString 생략(자동호출)
//	Student.toString(student1);
	
	Student student2 = new Student();
	student2.setName("갑순");
	student2.setNumber(200);
	student2.setDepartment("건축학과");
	System.out.println(student2);
//	Student.toString(student2);
	
	student2.setDepartment("수학과");
	System.out.println(student2);
//	Student.toString(student2);
	}
}
