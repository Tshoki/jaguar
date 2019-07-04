package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.jaguar.dto.UserInfoDTO;
import com.internousdev.jaguar.util.DBConnector;

public class UserInfoDAO {
	
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
//	マイページで使う
	public UserInfoDTO getUserInfo(String userId) {
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

}
