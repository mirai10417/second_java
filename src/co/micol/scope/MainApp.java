package co.micol.scope;

import co.micol.interfaceTest.MemberServiceImpl;
import co.micol.interfaceTest.StudentServiceImple;
import co.micol.interfaceTest.Service;

public class MainApp {
	
	public static void main(String[] args) {
//		Member member = new Member();
//		member.setId("Home");
//		member.setPw("4321");
//		member.setName("홍길동");
//		member.setAddr("대구광역시 중구 국채보상로");
//		member.setTel("010-1234-1234");
//		member.setGrade(1);
//		
//		member.toString();
//		
//		member.insert("Park", "2345", "박승리", "서울광역시 여의도 증권","010-1111-1111",2);
//		member.toString();
//		System.out.println(member.getId()+" "+member.getPw());		
//		System.out.println(member.toString());
		
//		Service service = new MemberServiceImpl();
//		service.insert();
//		service.display();
		
		Service s2 = new StudentServiceImple();
		s2.insert();
		s2.display();
	}

}
