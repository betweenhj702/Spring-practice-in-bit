package sdo.md.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;

import sdo.md.domain.Board;


import static sdo.md.sql.BoardSQL.*;

@Log4j
@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private HikariDataSource dataSource;
		
	@Override
	public List<Board> list(int cp, int ps) {
		List<Board> list = new ArrayList<Board>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = LIST;
		int initRow = (cp-1)*ps;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, initRow);
			pstmt.setInt(2, (initRow+ps));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				long seq = rs.getLong("SEQ");
				String writer = rs.getString("WRITER");
				String email = rs.getString("EMAIL");
				String subject = rs.getString("SUBJECT");
				Date rdate = rs.getDate("RDATE"); 
				list.add(new Board(seq, writer, email, subject, null, rdate));
			}
		}catch(SQLException se) {
			log.info("BoardDaoImpl list() se: " + se);
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}
		return list;
	}

	@Override
	public void insert(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = INSERT;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getEmail());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getContent());
			pstmt.executeUpdate();
		}catch(SQLException se) {
			log.info("BoardDaoImpl insert() se: " + se);
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}

	}

	@Override
	public Board showContent(long seq) {
		Board board = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = CONTENT;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String writer = rs.getString("WRITER");
				String email = rs.getString("EMAIL");
				String subject = rs.getString("SUBJECT");
				String content = rs.getString("CONTENT");
				Date rdate = rs.getDate("RDATE");
				board = new Board(seq, writer, email, subject, content, rdate);
			}
			return board;
		}catch(SQLException se) {
			log.info("BoardDaoImpl showContent() se: " + se);
			return null;
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}
	}

	@Override
	public void delete(long seq) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = DELETE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, seq);
			pstmt.executeUpdate();
		}catch(SQLException se) {
			log.info("BoardDaoImpl delete() se: " + se);
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}

	}

	@Override
	public void update(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = UPDATE;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getEmail());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getContent());
			pstmt.setLong(4, board.getSeq());
			pstmt.executeUpdate();
		}catch(SQLException se) {
			log.info("BoardDaoImpl update() se: " + se);
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}
	}

	@Override
	public long getTotalCount() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;		
		String sql = COUNT;
		try {
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				long count = rs.getLong(1);
				return count;
			}else {
				return -1L;
			}
		}catch(SQLException se) {
			System.out.println("getTotalCount() se: " + se);
			return -1L;
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(SQLException se) {}
		}
	}

}
