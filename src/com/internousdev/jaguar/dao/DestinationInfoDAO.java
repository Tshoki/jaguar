package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.internousdev.jaguar.util.DBConnector;
import java.util.List;
import java.util.ArrayList;

public class DestinationInfoDAO {
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	public int insert(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String email, String telNumber, String userAddress)throws SQLException{
	int count=0;

	String sql="INSERT INTO destination_info(id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address)"
				+ "VALUES(?,?,?,?,?,?,?)";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(4, firstNameKana);
			ps.setString(5, email);
			ps.setString(6, telNumber);
			ps.setString(7, userAddress);

			count=ps.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;
	}
		public List<DestinationInfoDTO> getDestinationInfo(String userId)throws SQLException{
			List<DestinationInfoDTO> destinationInfoDTO=new ArrayList<DestinationInfoDTO>();
			String sql="SELECT id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address"
					+ "FROM destination_info"
					+ "WHERE userId";
		try{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs=ps.getResultSet();
			while(rs.next()){	//複数あるからwhile １つでいいならif
				DestinationInfoDTO DID=new DestinationInfoDTO();
				DID.setUserId(rs.getString("id"));
				DID.setFamilyName(rs.getString("family_name"));
				DID.setFirstName(rs.getString("first_name"));
				DID.setFamilyNameKana(rs.getString("family_name_kana"));
				DID.setFirstNameKana(rs.getString("first_name_kana"));
				DID.setEmail(rs.getString("email"));
				DID.setTelNumber(rs.getString("tel_number"));
				DID.setUserAddress(rs.getString("user_address"));
				destinationInfoDTO.add(DID);

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return destinationInfoDTO;
	}
}
