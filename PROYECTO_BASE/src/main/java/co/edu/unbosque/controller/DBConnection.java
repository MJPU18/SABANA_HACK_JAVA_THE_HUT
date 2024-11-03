package co.edu.unbosque.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private Connection connect=null;
	private Statement statement=null;
	private PreparedStatement preparedstatement=null;
	private ResultSet resultset=null;
	private final String IP="127.0.0.1";
	private final String PORT="3306";
	private final String DATABASE="rositastationery";
	private final String USERNAME="root";
	private final String PASSWORD="p3r4o";
	
	public DBConnection() {}
	
	public void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connect=DriverManager.getConnection("jdbc:mysql://"+IP+":"+PORT+"/"+DATABASE,USERNAME,PASSWORD);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(resultset!=null) {
				resultset.close();
			}
			if(statement!=null) {
				statement.close();
			}
			if(connect!=null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnect() {
		return connect;
	}
	
	public void setConnect(Connection connect) {
		this.connect = connect;
	}
	
	public Statement getStatement() {
		return statement;
	}
	
	
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	public PreparedStatement getPreparedstatement() {
		return preparedstatement;
	}
	
	public void setPreparedstatement(PreparedStatement preparedstatement) {
		this.preparedstatement = preparedstatement;
	}

	public ResultSet getResultset() {
		return resultset;
	}
		
	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}
	
	public String getIP() {
		return IP;
	}
	
	public String getPORT() {
		return PORT;
	}
	
	public String getDATABASE() {
		return DATABASE;
	}
	
	public String getUSERNAME() {
		return USERNAME;
	}
	
	public String getPASSWORD() {
		return PASSWORD;
	}

}