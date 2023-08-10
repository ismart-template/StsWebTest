package net.hibiznet.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.hibiznet.app.dao.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<Map<String, Object>> selectUserList(Map<String, Object> params) {
		
		List<Map<String,Object>> result = userDAO.selectUserList(params);
		
		return result;
	}	
	
	public Map<String, Object> selectUser(Map<String, Object> params) {
		
		return (Map<String, Object>)userDAO.selectUser(params);
	}
	@Transactional(rollbackFor=Exception.class)
	public void insertUser(Map<String, Object> params) {
		try {
			userDAO.insertUser(params);
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	@Transactional(rollbackFor=Exception.class)
	public void updateUser(Map<String, Object> params) {
		
		userDAO.insertUser(params);
	}
	@Transactional(rollbackFor=Exception.class)
	public void deleteUser(Map<String, Object> params) {
		
		userDAO.deleteUser(params);
	}	
}
