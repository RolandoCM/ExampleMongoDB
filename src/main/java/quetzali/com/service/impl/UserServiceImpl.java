package quetzali.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;
import quetzali.com.dao.entity.UserEntity;
import quetzali.com.dao.repository.UserRepository;
import quetzali.com.service.IUserService;

@Log4j
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity findUserCve(String cve) {
		return userRepository.findByCve(cve);
	}

	@Override
	public UserEntity saveUser(UserEntity user) {
		UserEntity userSaved = userRepository.save(user);
		
		return userSaved;
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		UserEntity userUp = userRepository.findByCve(user.getCve());
		user.setId(userUp.getId());
		log.info("Usuario a actualizar: "+ user);
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(String user) {
		userRepository.deleteByCve(user);
	}

}
