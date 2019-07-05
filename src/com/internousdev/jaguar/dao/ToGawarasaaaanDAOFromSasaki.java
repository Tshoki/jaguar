package com.internousdev.jaguar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.jaguar.util.DBConnector;

public class ToGawarasaaaanDAOFromSasaki {

	//この下の行からコピーして、UserInfoDAOに貼り付けて下さい

	//ユーザー登録用
	//登録しようとしたユーザーIDが既に存在しているかをチェックするメソッド。結果をboolean型のtrue or falseで返す。
	public Boolean isExistsUserInfo(String userId){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		boolean result=false;
		//count(*)でクエリの条件に一致するレコード結果を全て取得する。（as countでcountという列名をつける）
		String sql="select count(*) as count from user_info where user_id=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				//現在の列の値をint型で取得し、一件以上存在するかをチェック
				if(rs.getInt("count")>0){
					//存在すればtrueを返す
					result=true;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
