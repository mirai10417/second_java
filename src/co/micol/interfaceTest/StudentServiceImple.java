package co.micol.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.micol.scope.Student;
//import co.micol.scope.Member;

public class StudentServiceImple implements Service {
//	private Student student = new Student();	
	private ArrayList<Student> list;

	@Override
	public void insert() {
		Student student;
		list = new ArrayList<Student>();
//		student = new Student();
		boolean b = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("학생을 추가하겠습니까?: (Y/N)");
			String yesNo = sc.nextLine();
			if (yesNo.equals("N")) {
				b = false;
				break;
			}
			student = new Student();;
			System.out.println("학생 ID를 입력하세요: ");
			student.setId(sc.nextLine());
			System.out.println("학생 이름을 입력하세요: ");
			student.setName(sc.nextLine());
			System.out.println("학생 전공을 입력하세요: ");
			student.setMajor(sc.nextLine());
			System.out.println("학생 전화번호를 입력하세요: ");
			student.setTel(sc.nextLine());
			sc.nextLine();
			list.add(student);
		} while (b);
		sc.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}	
	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for (Student student : list) {
			System.out.print(student.getId() + " ");
			System.out.print(student.getName() + " ");
			System.out.print(student.getMajor() + " ");
			System.out.println(student.getTel() + " ");
		}
	}

}
