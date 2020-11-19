package com.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.PriyathamGalisettyDAO;
import com.example.modal.PriyathamGalisetty;

@Component
public class PriyathamGalisettyDAOImpl implements PriyathamGalisettyDAO{
	
	@Autowired
	DataSource dataSource;

	@Override
	public List<PriyathamGalisetty> findByFirstName(String firstName) {
		List<PriyathamGalisetty> galisetties = new ArrayList<PriyathamGalisetty>();
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from PRIYATHAMGALISETTY where FIRST_NAME = ? sort by id asc");
			pstmt.setString(1, firstName);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PriyathamGalisetty pg = new PriyathamGalisetty();
				pg.setFirstName(rs.getString("FIRST_NAME"));
				pg.setLastName(rs.getString("FIRST_NAME"));
				pg.setId(rs.getLong("ID"));
				galisetties.add(pg);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			clearConnection(conn, rs, pstmt);
		}
		return galisetties;
	}

	@Override
	public List<PriyathamGalisetty> getAllData() {
		List<PriyathamGalisetty> galisetties = new ArrayList<PriyathamGalisetty>();
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from PRIYATHAMGALISETTY");
			while(rs.next()) {
				PriyathamGalisetty pg = new PriyathamGalisetty();
				pg.setFirstName(rs.getString("FIRST_NAME"));
				pg.setLastName(rs.getString("LAST_NAME"));
				pg.setId(rs.getLong("ID"));
				galisetties.add(pg);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			clearConnection(conn, rs, stmt);
		}
		return galisetties;
	}
	
	private void clearConnection(Connection conn, ResultSet rs,Statement stmt) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void clearConnection(Connection conn, ResultSet rs,PreparedStatement pstmt) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public int deletefromPG(String firstName) {
		int rowsdel = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("DELETE from PRIYATHAMGALISETTY where FIRST_NAME = ?");
			pstmt.setString(1, firstName);
			rowsdel = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			clearConnection(conn,null,pstmt);
			
		}
		
		return rowsdel;
	}
	//Update priyathamgalisetty set last_name =? where id =?

	@Override
	public Boolean insertintoPG(PriyathamGalisetty pg) {
		Boolean  rowsdel = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO priyathamgalisetty VALUES (?, ?, ?)");
			pstmt.setString(1,pg.getFirstName());
			pstmt.setString(2, pg.getLastName());
			pstmt.setLong(3, pg.getId());
			pstmt.executeUpdate();
			rowsdel = true;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			clearConnection(conn,null,pstmt);
			
		}
		return rowsdel;
	}

	@Override
	public int updatePG() {
		int rowsdel = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("Update priyathamgalisetty set last_name =? where id =?");
			pstmt.setString(1, "Yelimineti");
			pstmt.setLong(2, 2);
			rowsdel = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			clearConnection(conn,null,pstmt);
			
		}
		
		return rowsdel;
	}
}
