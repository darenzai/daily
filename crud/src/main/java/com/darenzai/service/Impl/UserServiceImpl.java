package com.darenzai.service.Impl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.darenzai.dao.UserDao;
import com.darenzai.model.User;
import com.darenzai.service.UserService;
 
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//��ʾһ������������Ŀ���Ǹ��Ǹ��෽�����������һ��������ע�ͣ���ע�����͵�����д���෽������������������һ��������Ϣ��
	
	public String addInfo(User addInfo) {
		if (userDao.insertSelective(addInfo) == 1) {
			return "��ӳɹ�";
		}
		return "���ʧ��";
	}
	
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	public String delete(int id) {
		if (userDao.deleteByPrimaryKey(id) == 1) {
			return "ɾ���ɹ�";
		}
		return "ɾ��ʧ��";
	}
	
	public User findById(int id) {
		return userDao.selectByPrimaryKey(id);
	}
	
	public String update(User addInfo) {
		if (userDao.updateByPrimaryKeySelective(addInfo) == 1) {
			return "���³ɹ�";
		}
		return "����ʧ��";
	}
	
	public User login(User user) {
		return userDao.selectByUsernameAndPassword(user);
	}
}
