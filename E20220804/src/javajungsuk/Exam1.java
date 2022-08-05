package javajungsuk;

public class Exam1 {

//[문제1] 다음의 예제를 완성하시오.
//getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)

//getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
// String 메소드 사용..? replace... ? replace(CharSequence target, CharSequence replace)

//[출처] [Java1000제]Word Scramble 1 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) | 작성자 남궁성

	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };

		String answer = getAnswer(strArr);
//		String question = getScrambledWord(answer);

//		System.out.println("Question:" + question);
		System.out.println("Answer:" + answer);
	} // main

	public static String getAnswer(String[] strArr) {
		// 내용을 완성하세요.
		
		int a = (int)(Math.random()*4)+1;
		String answer = strArr[a];
		
		return answer;
	}
}

//	public static String getScrambledWord(String str) { // 매개변수 문자열타입 str 
//		// 내용을 완성하세요.
//
//	} // scramble(String str)
//}
// [출처] [Java1000제]Word Scramble 1 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어,
// javascript, python) | 작성자 남궁성
