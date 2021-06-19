import java.util.*;



import java.sql.*;

public class EmpDao {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "Aparna@123");
			System.out.println("DB connected successfully!!!" + con);

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(Emp e) {
		int status = 0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into usertb(id,name,password,email,country) values (?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getPassword());
			ps.setString(4, e.getEmail());
			ps.setString(5, e.getCountry());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

//	public int register(Emp e) throws ClassNotFoundException, SQLException {
//
//		int result = 0;
//		Connection con = EmpDao.getConnection();
//		String INSERT_USERS_SQL = "INSERT INTO employeetable"
//				+ "(id,first_name,last_name,username,password) VALUES" + "(?,?,?,?,?,?,?);";
//
//		// Step 2:Create a statement using connection object
//		PreparedStatement preparedStatement = con.prepareStatement(INSERT_USERS_SQL);
//		preparedStatement.setInt(1, e.getId());
//		preparedStatement.setString(2, e.getName());
//		preparedStatement.setString(3, e.getLastName());
//		preparedStatement.setString(4, e.getUsername());
//		preparedStatement.setString(5, e.getPassword());
//		
//
//		System.out.println(preparedStatement);
//		// Step 3: Execute the query or update query
//		result = preparedStatement.executeUpdate();
//
//		return result;
//	}
//	public static boolean checkUser(String email, String password) {
//		boolean status = false;
//		try {
//			Connection con = EmpDao.getConnection();
//			PreparedStatement ps = con.prepareStatement("select * from usertb where email=? and password=?");
//			ps.setString(1, email);
//			ps.setString(2, password);
//			ResultSet rs = ps.executeQuery();
//			status = rs.next();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}
//	
	public static int update(Emp e) {
		int status = 0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update usertb set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from usertb where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static Emp getEmployeeById(int id) {
		Emp e = new Emp();

		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from usertb where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	public static List<Emp> getAllEmployees() {
		List<Emp> list = new ArrayList<Emp>();

		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from usertb");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}