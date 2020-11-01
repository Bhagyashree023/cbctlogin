package com.cbct.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cbct.vo.UserDetailsVO;

@Repository
public class UserDetailsDao{
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 @Autowired
	 private DataSource dataSource;
	 	
	    
	    public int count() {
	        return jdbcTemplate
	                .queryForObject("select count(*) from admin", Integer.class);
	    }
	    public int isValidUser(UserDetailsVO user) {
	    	String sql="select count(*) from admin where emailid=? and password=?";
	        return jdbcTemplate
	                .queryForObject(sql,new Object[] {user.getEmailid(),user.getPassword()},Integer.class
	                		);
	    }
	    
	    public UserDetailsVO findUser(UserDetailsVO user) {
	    	String sql="select * from admin where emailid=? and password=?";
	        return jdbcTemplate
	                .queryForObject(sql,new Object[] {user.getEmailid(),user.getPassword()},
	                		(rs,rowNum)->new UserDetailsVO(
	                				rs.getString("fname"),
	                				rs.getString("mname"),
	                				rs.getString("lname"),
	                				rs.getString("phnumber"),
	                				rs.getString("emailid"),
	                				rs.getString("instname"),
	                				rs.getInt("userid"),
	                				rs.getString("role")
	                				)
	                		);
	    }
	    
//	    public int createUser(UserDetailsVO user) {
////	    	    	String sql="INSERT INTO admin VALUES ('?', '?', '?', '?', '?', '?', '?', ?, '?')";
//	    	    	String sql="INSERT INTO `admin` (FName, MName,LName, Phnumber,EmailID, Password)"
//	    	    			+ " VALUES (?, ?, ?, ?, ?, ?)";
//	    	    	
//	    			  return jdbcTemplate .update(sql,new Object[]
//	    			  {user.getFname(),user.getMname(),user.getLname(),user.getPhnumber(),user.
//	    			  getEmailid(),
//	    			  user.getPassword(),user.getInstname(),user.getRole()},Integer.class );
//	    }
	    
	    public int createUser(UserDetailsVO user) {
	    	//    	String sql="INSERT INTO admin VALUES ('?', '?', '?', '?', '?', '?', '?', ?, '?')";
//	    	    	String sql="INSERT INTO `admin` (FName, MName,LName, Phnumber,EmailID, Password)"
//	    	    			+ " VALUES (?, ?, ?, ?, ?, ? )";
	    	    	
	    	    	String sql="INSERT INTO admin (FName, MName, LName, Phnumber, EmailID, Password,InstName,Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	    	    	
	    	    	jdbcTemplate = new JdbcTemplate(dataSource);
	    	    	System.out.println(user);
	    	    	Connection con = null;
	    	    	PreparedStatement st = null;
	    	    	try {
	    				con = dataSource.getConnection();
	    				st = con.prepareStatement(sql);
	    				st.setString(1,user.getFname());
	    				st.setString(2,user.getMname());
	    				st.setString(3,user.getLname());
	    				st.setString(4,user.getPhnumber());
	    				st.setString(5,user.getEmailid());
	    				st.setString(6,user.getPassword());
	    				st.setString(7,user.getInstname());
	    				st.setString(8,user.getRole());
	    				return st.executeUpdate();
	    			} catch (SQLException e) {
	    				 //TODO: handle exception
	    				e.printStackTrace();
	    			}finally {
	    				try {
	    					con.close();
	    				} catch (SQLException e) {
	    					// TODO Auto-generated catch block
	    					e.printStackTrace();
	    				}
	    				
	    			}
	    	    	return 0;

	    	}
	    }
