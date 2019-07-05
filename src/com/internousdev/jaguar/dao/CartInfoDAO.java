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

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	CartInfoDTO dto = new CartInfoDTO();

	//
	public List<CartInfoDTO> getCartInfoDTOList(String userId){

		List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();

		String sql = "SELECT"
						+ "cart_info.id"
						+ "cart_info.product_id"
						+ "cart_info.product_name"
						+ "cart_info.product_name_kana"
						+ "product_info.image_file_path"
						+ "product_info.image_file_name"
						+ "product_info.price"
						+ "product_info.release_company"
						+ "product_info.release_date"
						+ "product_info.product_count"
						+ "(cart_info.price * cart_info.product_count) AS sub_total"
						+ "FROM cart_info LEFT JOIN product_info"
						+ "ON cart_info.product_id = product_info.product_id"
						+ "WHERE cart_info.user_id = ?";

		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductName(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setSubTotal(rs.getInt("sub_total"));
				cartInfoDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return cartInfoDTOList;
	}


	// カート合計金額
	/*
	public int getTotalPrice(String userId){

		int totalPrice = 0;

		// userId が 一致する レコード内 の product_count と price を 乗算
		String sql = "SELECT"
						+ "(product_count * price) AS total_price"
						+ "FROM cart_info LEFT JOIN product_info"
						+ "ON cart_info.product_id = product_info.product_id"
						+ "WHERE user_id = ?";

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				totalPrice = rs.getInt("total_price");
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return totalPrice ;
	}
	*/

	// カートに存在する商品購入個数を更新する
	// user_id と product_id を参照に 個数の更新
	/*
	public int updateProductCount(String userId, int productId, int productCount){

		String sql = "UPDATE cart_info SET productCount = ? WHERE user_id = ?";

		try{
			PreparedStatement ps = con.preparedStatement(sql);
			ps.set(1, productCount);
			ps.set(2, userId);
			ps.set(3, productId);

			ps.executeUpdate();
		}
	}
	*/

	// userId productIdの商品のカートに入れた情報が存在するかどうかを判別する




	//引数に入れたユーザーIDが商品IDを持っているかチェックするメソッド


		public boolean isExistsSameProduct(String userId, int productId){

			boolean result = false;

			String sql = "select count(*) as count from  cart_info where user_id = ? and product_id = ?";


			try{
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, userId);
				ps.setInt(2, productId);

				ResultSet rs = ps.executeQuery();

					while(rs.next()){

						if(rs.getInt("count") > 0){

							result = true;
						}
					}
			}catch(SQLException e){
				e.printStackTrace();
			}try{
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return result;
		}





		// 仮IDで追加した商品の個数を、ユーザーIDで追加した同じ商品の個数に追加するアップデートメソッド


		public int updateProductCount(String userId, int productId, int productCount){

			int count  = 0;

			String sql = "update cart_info set product_count = (product_count + ?), update_date = now() where user_id = ? and product_id = ?";

			try{
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setInt(1, productCount);
				ps.setString(2, userId);
				ps.setInt(3, productId);

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




		// カート情報テーブルから、引数に入れたユーザーID、商品IDのデータを削除するメソッド


		public int deleteCartInfo (String userId, int productId){

			int count = 0;
			String sql = "delete from cart_info where user_id = ? and product_id = ?";

			try{
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, userId);
				ps.setInt(2, productId);

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





	       //ある商品について、カート情報テーブルのuser_idを、仮IDからユーザーIDに更新するメソッド

			public int updateUserId(String userId, String tempUserId, int productId) {


				int count = 0;
				String sql = "update cart_info set user_id = ? , update_date = now() where user_id = ? and product_id = ?";

				try {
					PreparedStatement ps = con.prepareStatement(sql);

					ps.setString(1, userId);
					ps.setString(2, tempUserId);
					ps.setInt(3,productId);

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


}
