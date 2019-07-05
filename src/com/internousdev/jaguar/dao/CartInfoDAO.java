package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.jaguar.dto.CartInfoDTO;
import com.internousdev.jaguar.util.DBConnector;


public class CartInfoDAO {

	// 未完成

	private DBConnector db = new DBConnector() ;
	private Connection con = db.getConnection() ;

	CartInfoDTO dto = new CartInfoDTO();
	List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();

	public CartInfoDTO getCartInfo(String userId){

		String sql ="SELECT ここ長いよ WHERE userId = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			// 1件ではないので while
			while(rs.next()){
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductName(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setPrice(rs.getInt("price"));
				cartInfoDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return test;
	}

	// カート合計金額を( 個数 * 金額 )

}
