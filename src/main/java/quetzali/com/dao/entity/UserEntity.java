package quetzali.com.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

/**
 * <h1>User Entity</h1> Clase mapeo de colección mongodb de usuarios, utiliza el
 * tag {@link Data} para evitar escribir los metodos seter y geter
 */
@Data
@ToString
@Document(collection = "user")
public class UserEntity {

	@Id
	private String id;
	private String cve;
	private String nombre;
	private String apellido;
	private int edad;

}
