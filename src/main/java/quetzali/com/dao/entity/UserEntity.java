package quetzali.com.dao.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Document
public class UserEntity {
	
	@Id
	private ObjectId id;
	private String cve;
	private String nombre;
	private String apellido;
	private int edad;
	

}
