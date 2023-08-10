package net.hibiznet.app.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertUser(Map<String,Object> params) {
		System.out.println("====> Mybatis로 insertBoard() 기능 처리");
		sqlSessionTemplate.insert("BoardDAO.insertBoard");
	}	
	
	public void updateUser(Map<String,Object> params) {
		System.out.println("====> Mybatis로 updateBoard() 기능 처리");
		sqlSessionTemplate.update("BoardDAO.updateBoard");
	}	
	
	public void deleteUser(Map<String,Object> params) {
		System.out.println("====> Mybatis로 deleteBoard() 기능 처리");
		sqlSessionTemplate.delete("BoardDAO.deleteBoard");
	}
	
	public Map<String,Object> selectUser(Map<String,Object> params) {
		System.out.println("====> Mybatis로 getBoard() 기능 처리");
		return (Map<String,Object>)sqlSessionTemplate.selectOne("BoardDAO.getBoard", params);
	}
	
	public List<Map<String,Object>> selectUserList(Map<String,Object> params) {
		System.out.println("====> Mybatis로 getBoardList() 기능 처리");
		return sqlSessionTemplate.selectList("BoardDAO.getBoardList", params);
	}	
}
