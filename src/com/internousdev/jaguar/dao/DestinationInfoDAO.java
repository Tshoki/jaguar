package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.internousdev.jaguar.util.DBConnector;

public class DestinationInfoDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DestinationInfoDTO destinationInfoDTO=new DestinationInfoDTO();

	public DestinationInfoDTO getDestinatinoInfo(int id, String familyName, String firstName, String familyNameKana, String firstNameKana, String email, String telNumber, String userAddress){
		String sql="SELECT id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address"
				+ "FROM destination_info";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(4, firstNameKana);
			ps.setString(5, email);
			ps.setString(6, telNumber);
			ps.setString(7, userAddress);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
//				destinationInfoDTO.setId(rs.getInt("id"));
//				destinationInfoDTO.setFamilyName(rs.getString("family_name"));
//				destinationInfoDTO.setFirstName(rs.getString("first_name"));
//				destinationInfoDTO.setFamilyNameKana(rs.getString("family_name_kana"));
//				destinationInfoDTO.setFirstNameKana(rs.getString("first_name_kana"));
//				destinationInfoDTO.setEmail(rs.getString("email"));
//				destinationInfoDTO.setTelNumber(rs.getString("tel_number"));
//				destinationInfoDTO.setUserAddress(rs.getString("user_address"));
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return destinationInfoDTO;
	}
}
