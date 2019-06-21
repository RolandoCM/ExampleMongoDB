package quetzali.com.service;

import java.util.List;

import quetzali.com.dao.entity.UserEntity;

/**
 * <H1>Interface User Service</h1>
 * 
 * Definición de metodos de user service
 *
 */
public interface IUserService {
	List<UserEntity> findAll();
	UserEntity findUserCve( String cve);
	UserEntity saveUser(UserEntity user);
	UserEntity updateUser(UserEntity user);
	void deleteUser(String user);
	
}
