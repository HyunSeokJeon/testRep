package chap11.sec05.Exam02_gc;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp�� ���������� �����ϴ� �����ȣ:");
		System.out.println(emp.eno);
		System.gc();
	}
}