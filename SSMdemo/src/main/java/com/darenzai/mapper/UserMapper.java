package com.darenzai.mapper;



import java.util.List;

import com.darenzai.pojo.User;

public interface UserMapper {
	//����û�
	void addUser(User user);
	//�����û�
	boolean updateUser(User user);
	//ɾ���û�
	boolean deleteUser(int id);
	//�����û�
	User findUser(int id);
	//�г������û�
	List<User> findAll();
}
