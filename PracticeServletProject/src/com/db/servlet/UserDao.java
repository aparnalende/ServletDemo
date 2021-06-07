package com.db.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aparna?useSSL=false", "root", "Aparna@123");
			System.out.println("DB connected successfully!!!" + con);

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(User u) {
		int status = 0;
		try {
			Connection con = UserDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into user(id,fname,lname,mobile,email,uname,pass,age) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getFirstName());
			ps.setString(3, u.getLastName());
			ps.setLong(4, u.getMobile());
			ps.setString(5, u.getEmail());
			ps.setString(6, u.getUname());
			ps.setString(7, u.getPassword());
			ps.setInt(8, u.getAge());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

//	public static List<User> getAllUsers() {
//		List<User> list = new ArrayList<User>();
//
//		try {
//			Connection con = UserDao.getConnection();
//			PreparedStatement ps = con.prepareStatement("select * from user");
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				User u = new User();
//				u.setId(rs.getInt(1));
//				u.setFirstName(rs.getString(2));
//				u.setLastName(rs.getString(3));
//				u.setMobile(rs.getLong(4));
//				u.setEmail(rs.getString(5));
//				u.setUname(rs.getString(6));
//				list.add(u);
//			}
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list;
//
//	}
}
