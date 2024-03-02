package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();
	private BoardDao() {} // 생성자
	
	public static BoardDao getInstance() {
		BoardDao.getConnection();
		return dao;
	}
	
	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<>();
		String sql = "select * from board order by memberno desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("title"), 
						rs.getString("content"), rs.getString("regtime"),
						rs.getInt("hits"), rs.getInt("memberno"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Board selectOne(int num, boolean inc) {
		Board board = null;
		String sql = "select * from board where num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("title"), 
						rs.getString("content"), rs.getString("regtime"),
						rs.getInt("hits"), rs.getInt("memberno"));

			}
			if (inc) {
				pstmt.executeUpdate("update board set hits=hits+1 where memberno="+num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
		
	}
	
	public int delete(int num) {
		int result = 0;
		try ( 
		        PreparedStatement pstmt = conn.prepareStatement(
		        		"delete from board where memberno=" + num);
		    ) {
				result = pstmt.executeUpdate();
		        
		    } catch(Exception e) {
		        e.printStackTrace();
		    }
		return result;
	}
	
	public int insert(Board board) {
		String sql = "insert into board(num, title, content, regtime, hits, memberno) values (?,?,?,now(),0,?)";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {

	    	pstmt.setInt(1, board.getNum());
	    	pstmt.setString(2, board.getTitle());
	    	pstmt.setString(3, board.getContent());
	    	pstmt.setInt(4, board.getMemberno());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	public int update(Board board) {
        String sql = "update board set num=?, title=?, content=?, regtime=now(), hits=? where memberno=?";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {

	    	pstmt.setInt(1, board.getNum());
	    	pstmt.setString(2, board.getTitle());
	    	pstmt.setString(3, board.getContent());
	    	pstmt.setInt(4, board.getHits());
	    	pstmt.setInt(5, board.getMemberno());
	    	
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
}






