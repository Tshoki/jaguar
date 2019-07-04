package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.jaguar.dto.UserInfoDTO;
import com.internousdev.jaguar.util.DBConnector;

public class UserInfoDAO {
	
//	マイページ用
	public UserInfoDTO getUserInfo(String userId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		String sql = "select * from user_info where user_id = ?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				userInfoDTO.setId(rs.getInt("id"));
				userInfoDTO.setUserId(rs.getString("userId"));
				userInfoDTO.setPassword(rs.getString("password"));
				userInfoDTO.setFamilyName(rs.getString("familyName"));
				userInfoDTO.setFirstName(rs.getString("firstName"));
				userInfoDTO.setFamilyNameKana(rs.getString("familyNameKana"));
				userInfoDTO.setFirstNameKana(rs.getString("firstNameKana"));
				userInfoDTO.setSex(rs.getInt("sex"));
				userInfoDTO.setEmail(rs.getString("email"));
				userInfoDTO.setLogined(rs.getInt("logined"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userInfoDTO;
	}

//	ユーザー作成用
	public int createUser(String familyName, String firstName, String familyNameKana, 
			String firstNameKana, String sex, String email, String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		String sql = "insert into user_info(user_id, password, family_name, first_name, family_name_kana,"
				+"first_name_kana, sex, email, status, logined, regist_date, update_date)"
				+"values(?,?,?,?,?,?,?,?,?,? now(), now())";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setString(7, sex);
			ps.setString(8, email);
			ps.setInt(9, 0);
			ps.setInt(10, 1);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
//	存在しているユーザーか
	public boolean isExistsUserInfo(String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;
		
		String sql = "select count(*) as count from user_info where user_id = ? and password = ?";
//	countで行を数える。行数を返す
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getInt("count") > 0) {
					result = true;
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
//	ユーザー情報
	public UserInfoDTO getUserInfo(String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		
		String sql = "select * from user_info where user_id = ? and password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				userInfoDTO.setId(rs.getInt("id"));
				userInfoDTO.setUserId(rs.getString("userId"));
				userInfoDTO.setPassword(rs.getString("password"));
				userInfoDTO.setFamilyName(rs.getString("familyName"));
				userInfoDTO.setFirstName(rs.getString("firstName"));
				userInfoDTO.setFamilyNameKana(rs.getString("familyNameKana"));
				userInfoDTO.setFirstNameKana(rs.getString("firstNameKana"));
				userInfoDTO.setSex(rs.getInt("sex"));
				userInfoDTO.setEmail(rs.getString("email"));
				userInfoDTO.setLogined(rs.getInt("logined"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userInfoDTO;
	}
	
//	パスワードリセット
	public int resetPassword(String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		
		String sql = "update user_info set password = ?, update_date = now() where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
//	ログイン認証
	public int login(String userId, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		
		String sql = "update user_info set logined = 1, update_date = now() where user_id = ? and password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
//	ログアウト
	public int logout(String userId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		
		String sql = "update user_info set logined = 0, update_date = now() where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}try {
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
