package com.adminDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.DatabaseConnector;

public class AdminDao 
{
public static boolean adminLogin(String aid,String apass)
{
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	boolean flag=false;
	try
	{
		con=DatabaseConnector.getConnection();
		st=con.createStatement();
		String query="select*from m_admin where a_id='"+aid+"' and a_pass='"+apass+"'";
		rs=st.executeQuery(query);
		if(rs.next())
		{
			flag=true;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return flag;
}
}
