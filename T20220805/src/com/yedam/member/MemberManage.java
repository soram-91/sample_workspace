package com.yedam.member;

import com.yedam.common.DAO;

// member 관련 sql(database)를 다 작성
public class MemberManage extends DAO {

	// 싱글톤
	private static MemberManage mm = null; // null값을 넣어주지 않으면 값이 무엇인지 확인할 수 없음. null값이면 메모리사용 xx

	// 생성자 생성 막기
	private MemberManage() {

	}

	public static MemberManage getInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;
	}

	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null; // 일치하는 값이 없으면 null값 반환.
		try {
			// 1. DB 연결
			conn();
			// 2. sql 작성
			String sql = "SELECT * FROM MEMBER WHERE member_id = ? AND member_pw = ?";
			// 3. 창구만들기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return mem;
	}
}