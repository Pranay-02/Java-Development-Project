import java.util.*;
import java.sql.*;

public class CustDao
{

	public static Connection getConnection()
        {
	Connection con=null;
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		}
            catch(ClassNotFoundException | SQLException e)
            {
                System.out.println(e);
            }
		return con;
	}
	
        public static int save(Customer c)
        {
		int status=0;
		try{
                    try (Connection con = CustDao.getConnection())
                    {
                        PreparedStatement ps=con.prepareStatement("insert into cust(name,email,password,date,gender,phone,country) values (?,?,?,?,?,?,?)");
                        ps.setString(1,c.getName());
                        ps.setString(2,c.getEmail());
                        ps.setString(3,c.getPassword());
                        ps.setString(4,c.getDate());
                        ps.setString(5,c.getGender());
                        ps.setString(6,c.getPhone());
                        ps.setString(7,c.getCountry());
                        status=ps.executeUpdate();
                    
                        PreparedStatement qs=con.prepareStatement("insert into login(email,password) values (?,?)");
                        qs.setString(1,c.getEmail());
                        qs.setString(2,c.getPassword());
                        status=qs.executeUpdate();
                    
                    }
		}catch(SQLException ex){}
		
		return status;
	}
        
	public static int update(Customer c)
        {
		int status=0;
		try
                {
                    try (Connection con = CustDao.getConnection()) 
                    {
                        PreparedStatement ps=con.prepareStatement("update cust set name=?,email=?,password=?,date=?,gender=?,phone=?,country=? where id=?");
                        ps.setString(1,c.getName());
                        ps.setString(2,c.getEmail());
                        ps.setString(3,c.getPassword());
                        ps.setString(4,c.getDate());
                        ps.setString(5,c.getGender());
                        ps.setString(6,c.getPhone());
                        ps.setString(7,c.getCountry());
                        ps.setInt(8,c.getId());
                        status=ps.executeUpdate();
                    }
		}
                catch(SQLException ex){}
		
		return status;
	}
        
	public static int delete(int id)
        {
		int status=0;
		try
                {
                    try (Connection con = CustDao.getConnection()) 
                    {
                        PreparedStatement ps=con.prepareStatement("delete from cust where id=?");
                        ps.setInt(1,id);
                        status=ps.executeUpdate();
                    }
		}
                catch(SQLException e){}
		
		return status;
	}
        
	public static Customer getEmployeeById(int id)
        {
		Customer c=new Customer();	
		try
                {
                    try (Connection con = CustDao.getConnection()) 
                    {
                        PreparedStatement ps=con.prepareStatement("select * from cust where id=?");
                        ps.setInt(1,id);
                        ResultSet rs=ps.executeQuery();
                        if(rs.next())
                        {
                            c.setId(rs.getInt(1));
                            c.setName(rs.getString(2));
                            c.setEmail(rs.getString(3));
                            c.setPassword(rs.getString(4));
                            c.setDate(rs.getString(5));
                            c.setGender(rs.getString(6));
                            c.setPhone(rs.getString(7));
                            c.setCountry(rs.getString(8));
                        }
                    }
		}
                catch(SQLException ex){}
		
		return c;
	}
        
	public static List<Customer> getAllEmployees()
        {
		List<Customer> list=new ArrayList<>();
		try
                {
                    try (Connection con = CustDao.getConnection()) 
                    {

                        PreparedStatement ps=con.prepareStatement("select * from cust");
                        ResultSet rs=ps.executeQuery();
                        while(rs.next())
                        {
                            Customer c=new Customer();
                            c.setId(rs.getInt(1));
                            c.setName(rs.getString(2));
                            c.setEmail(rs.getString(3));
                            c.setPassword(rs.getString(4));
                            c.setDate(rs.getString(5));
                            c.setGender(rs.getString(6));
                            c.setPhone(rs.getString(7));
                            c.setCountry(rs.getString(8));
                            list.add(c);
                        }
                    }
		}
                catch(SQLException e){}
		
		return list;
	}
}