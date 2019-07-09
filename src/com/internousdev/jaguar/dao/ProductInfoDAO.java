package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.jaguar.dto.ProductInfoDTO;
import com.internousdev.jaguar.util.DBConnector;

public class ProductInfoDAO {

	/**
	 * 全ての商品情報を取得する
	 * @return List<ProductInfoDTO>型 : 商品情報 (productInfoDTOList)
	 */
	public List<ProductInfoDTO> getProductInfoListAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDescription(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTOList;
	}

	/**
	 * 商品IDを条件として商品情報を取り出す
	 * @param int型 商品ID(productId)
	 * @return ProductInfoDTO型 : 商品情報 (productInfoDTO)
	 */
	public ProductInfoDTO getProductInfoByProductId(int productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ProductInfoDTO productInfoDTO = new ProductInfoDTO();
		String sql = "select * from product_info where product_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();

			/**
			 * product_idはuniqueなのでSELECTの結果は1つ
			 * ここはsamplewebではwhileだがifで実行 して いい？
			 * ##########後で消す###########
			 */
			if (rs.next()) {
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDescription(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTO;
	}

	/**
	 * 関連商品を取得する。
	 * @param int型 カテゴリーID(categoryId)
	 * @param int型 商品ID(productId)
	 * @param int型 データを取得する開始位置 (limitOffset)
	 * @param int型 データ取得件数 (limitRowCount)
	 * @return  List<ProductInfoDTO>型 : 関連商品情報 (productInfoDTOList)
	 */
	public List<ProductInfoDTO> getRelatedProductList(int categoryId, int productId, int limitOffset,int limitRowCount) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where category_id=? and product_id not in(?) order by rand() limit ?,?";

		/**
		 * round():表示順をランダムにする。
		 * limit 0,3:0番目から3件データを取得する
		 */

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setInt(2, productId);
			ps.setInt(3, limitOffset);
			ps.setInt(4, limitRowCount);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDescription(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTOList;
	}

	/**
	 * キーワードを条件に商品情報を取得する
	 * @param String[]型 : キーワードの配列 (keywordsList)
	 * @return List<ProductInfoDTO>型 : 関連商品情報 (productInfoDTOList)
	 */
	public List<ProductInfoDTO> getProductInfoListByKeyword(String[] keywordsList) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info"; // 下記条件によってselect文のWHERE句が変わる

		boolean initializeFlag = true;	// 複数のキーワードを条件にするための条件分岐用のフラグ


		for (String keyword : keywordsList) { // 拡張for文 keywordsListの中身を一つずつ取り出す
			/*keywordが""だった場合WHERE句に含めてしまうと全て出てしまう。
			 * が、""だった場合そもそも全部出ることに問題は無く、
			 * 最初の"　"や" "はすべて呼び出し元Actionクラスのtrimで("")に変えているので、
			 * if (!(keyword.equals("")))は必要ない気がする。
			 * */
			if (!(keyword.equals(""))) {
				if (initializeFlag) {
					sql += " where (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";//ここの ' は出力する文字列
					//1つ目の条件を2つ目の条件を追加する際、whereではなくorと書く必要があるため、initializeFlagをfalseにする
					initializeFlag = false;
				} else {
					sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				}
			}
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDescription(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTOList;
	}

	/**
	 * カテゴリーIDとキーワードを条件に商品情報を取得する
	 * @param String[]型 : キーワードの配列 (keywordsList)
	 * @param String型 : カテゴリーID(categoryId)DBではintだがnullチェックの為ActionクラスでStringとして扱っている。
	 * @return List<ProductInfoDTO>型 : 商品情報のList(productInfoDTOList)
	 */
	public List<ProductInfoDTO> getProductInfoListByCategoryIdAndKeyword(String[] keywordsList, String categoryId) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where category_id=" + categoryId ;
		boolean initializeFlag = true;	// 複数のキーワードを条件にするための条件分岐用のフラグ

		for (String keyword : keywordsList) {
			// keywordに何かしらの文字列がはいっているか、キーワードリストの長さが1(空文字の時も条件式として加えるため)だった場合
			if (!(keyword.equals("")) || keywordsList.length == 1) {
				if (initializeFlag) {
					sql += " and ((product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
					//2つ目の条件を指定する際にwhereを記述する必要はないため、initializeFlagをfalseにする
					initializeFlag = false;
				} else {
					sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				}
			}
		}
		sql += ")";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setId(rs.getInt("id"));
				productInfoDTO.setProductId(rs.getInt("product_id"));
				productInfoDTO.setProductName(rs.getString("product_name"));
				productInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				productInfoDTO.setProductDescription(rs.getString("product_description"));
				productInfoDTO.setCategoryId(rs.getInt("category_id"));
				productInfoDTO.setPrice(rs.getInt("price"));
				productInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				productInfoDTO.setImageFileName(rs.getString("image_file_name"));
				productInfoDTO.setReleaseDate(rs.getDate("release_date"));
				productInfoDTO.setReleaseCompany(rs.getString("release_company"));
				productInfoDTOList.add(productInfoDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDTOList;
	}
}