package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 *  등록, 조회, 삭제
 */
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();		//  memoStorage : 컬렉션
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");		// File 클래스

	// 싱글톤.
	private static MemoManager instance = new MemoManager();

	// 생성자
	private MemoManager() {
		// 파일에 있는 정보를 읽어서 => ArrayList에 담아주기.
		readFromFile();								// 실행하는 시점에 메소드 사용.
	}

	public static MemoManager getInstance() {
		return instance;
	}

	// 등록
	public void inputData() {
		System.out.print("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("작성날짜> ");
		String date = scn.nextLine();
		System.out.print("내용> ");
		String content = scn.nextLine();

		memoStorage.add(new Memo(no, date, content));
	}

	// 날짜 입력하고 모든 메모 출력. (=조회)
	public void search() {
		System.out.println("날짜를 입력하세요> ");
		String memoDate = scn.nextLine();
		boolean isExist = false;  // 해당날짜에 메모가 있는지 없는지 체크
		for(int i =0; i<memoStorage.size(); i++) {
			if(memoDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i).toString());
				isExist =true;
			} 
		}
		if(!isExist)  // !isExist : (isExist == false)
		System.out.println("해당 날짜의 메모가 없습니다.");
		
	}
	
	// 삭제 (번호입력 > 삭제)
	public void deleteData() {
		System.out.println("삭제할 번호를 입력하세요> ");
		int delNo = Integer.parseInt(scn.nextLine());
		Iterator<Memo> iter = memoStorage.iterator();		// Interator 반복자
		while(iter.hasNext()) {
			Memo memo = iter.next();
			if(memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제완료.");
				return;			
			}
		}
		System.out.println("일치하는 번호가 없습니다.");
	}
	
	// 종료. (파일에 저장)
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체처리해주는 보조스트림 ObjectOutputStream : ArrayList => 바이트배열 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(memoStorage);
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// 파일정보 읽어서 컬렉션타입으로 변경.
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			// 객체처리해주는 보조스트림 ObjectInputStream : 바이트 => ArrayList 변경.
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
