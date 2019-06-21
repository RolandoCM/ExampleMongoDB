package quetzali.com.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import quetzali.com.dao.entity.UserEntity;

/**
 * <h1>User Repository</h1>
 * Interfaz que hereda los metodos de {@link MongoRepository}
 */
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>{
	void deleteByCve(String cve);
	UserEntity findByCve(String cve);
}
