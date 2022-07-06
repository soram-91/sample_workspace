package co.edu.compound;

public class FriendMain {
	public static void main(String[] args) {
		
		// f1
		Friend f1 = new Friend();
//		f1.name = "김민수";
		f1.setName("김민수");
//		f1.birthDate = "2월 12일";
		f1.setBirthDate("2월 12일");
//		f1.height = 169.5;
		f1.setHeight(178);
		
//		f1.email = "ok@naver.com";
		f1.setEmail("ok@naver.com");
//		f1.tel = "010-9434-5823";
		f1.setTel("010-9434-5823");
//		f1.weight = 56.7;
		f1.setWeight(56.7);
		f1.showInfo();
		System.out.printf("생일은 %s 입니다.", f1.getBirthDate());
		System.out.println("\n키는 " + f1.getHeight());
		System.out.printf("몸무게는 %.1f 입니다.", f1.getWeight());

	
	}

}
