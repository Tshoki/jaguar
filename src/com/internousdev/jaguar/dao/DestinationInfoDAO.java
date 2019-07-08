package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.jaguar.dto.DestinationInfoDTO;
import com.internousdev.jaguar.util.DBConnector;

public class DestinationInfoDAO {
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	public int insert(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String email, String telNumber, String userAddress){
	  int count=0;

	  String sql="INSERT INTO destination_info(id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address, regist_date, update_date)"
				  + "VALUES(?,?,?,?,?,?,?, now(), now())";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(5, firstNameKana);
			ps.setString(6, email);
			ps.setString(7, telNumber);
			ps.setString(8, userAddress);

			count=ps.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
    public List<DestinationInfoDTO> getDestinationInfo(String userId){
      List<DestinationInfoDTO> destinationInfoDTOList=new ArrayList<DestinationInfoDTO>();
	  String sql="SELECT id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address"
			      + "FROM destination_info"
				  + "WHERE userId";
		try{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, userId);
				ResultSet rs=ps.getResultSet();
			while(rs.next()){
				DestinationInfoDTO DID=new DestinationInfoDTO();
				DID.setUserId(rs.getString("id"));
				DID.setFamilyName(rs.getString("family_name"));
				DID.setFirstName(rs.getString("first_name"));
				DID.setFamilyNameKana(rs.getString("family_name_kana"));
				DID.setFirstNameKana(rs.getString("first_name_kana"));
				DID.setEmail(rs.getString("email"));
				DID.setTelNumber(rs.getString("tel_number"));
				DID.setUserAddress(rs.getString("user_address"));
				destinationInfoDTOList.add(DID);

			}
		}catch(Exception e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return destinationInfoDTOList;
	}

    public int deleteDestination(int id){
    	String sql="delete from destination_info where id=?";
    	int count=0;
    	try {
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setInt(1, id);
    		count=ps.executeUpdate();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}try{
    		con.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return count;
    }
}
