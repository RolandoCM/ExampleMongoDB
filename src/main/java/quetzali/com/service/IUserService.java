package quetzali.com.service;

import java.util.List;

import quetzali.com.dao.entity.UserEntity;

public interface IUserService {
	List<UserEntity> findAll();
	UserEntity findUserCve( String cve);
	UserEntity saveUser(UserEntity user);
	UserEntity updateUser(UserEntity user);
	
}
