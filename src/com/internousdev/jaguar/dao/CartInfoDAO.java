package com.internousdev.jaguar.dao;

import java.sql.Connection;

import com.internousdev.jaguar.util.DBConnector;

public class CartInfoDAO {

	private DBConnector db = new DBConnector() ;
	private Connection con = db.getConnection() ;

}
