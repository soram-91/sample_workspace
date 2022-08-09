package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {

	private static CoffeeDAO cd = null;

	private CoffeeDAO() {
	}

	public static CoffeeDAO getInstance() {
		return cd == null ? cd = new CoffeeDAO() : cd;
	}

	// 메뉴 조회
	public List<Coffee> getCoffee() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;

		try {
			conn();
			String sql = "select coffee_menu, coffee_price from coffee";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));

				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 메뉴 상세조회
	public List<Coffee> getDetailCoffee() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;

		try {
			conn();
			String sql = "select coffee_menu, coffee_price, coffee_explain from coffee";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));

				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 메뉴 등록 (메뉴, 가격, 설명)
	public int insertCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "insert into coffee (coffee_menu,coffee_price,coffee_explain) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	// 메뉴 삭제
	public int deleteCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "delete from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 판매 (단, 해당 기능 실행 시 1잔씩 판매)
	public int salesCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "update coffee set coffee_sales = coffee_sales+1 where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

	// 전체 메뉴 출력
	public List<Coffee> allMenu() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select coffee_menu, coffee_sales, coffee_price from coffee";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));

				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

}
