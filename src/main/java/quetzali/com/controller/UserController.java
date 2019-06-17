package quetzali.com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;
import quetzali.com.constants.Views;
import quetzali.com.dao.entity.UserEntity;
import quetzali.com.service.IUserService;

@Log4j
@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/")
	public String index() {
		return Views.INDEX.getView();
	}
	@GetMapping("/users")
	public String users(Model model) {
		List<UserEntity> users = userService.findAll();
		log.info("tamaño de lista: "+users.size());
		model.addAttribute("users", users);
		UserEntity user = new UserEntity();
		model.addAttribute("user", user);
		return Views.USUARIOS.getView();
	}
	
	@PostMapping("/save_user")
	public String saveUser(UserEntity user, Model model) {
		log.info("Ok");
		userService.saveUser(user);
		return "redirect:/users";
	}
	@GetMapping("/delete_user")
	public String deleteUser(@RequestParam(name="idUser") String idUser) {
		log.info("Elemento eliminado: "+idUser);
		userService.deleteUser(idUser);
		return "redirect:/users";
	}
	@GetMapping("/find_user")
	public ResponseEntity<?> findUser(@RequestParam(name="cve") String cve){
		Map<String, Object> response = new HashMap<>();
		log.info("peticion de actualizacion "+cve);
		UserEntity user = userService.findUserCve(cve);
		log.info("Usuario: "+user);
		response.put("user", user);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	@PutMapping("/update_user")
	public String updateUser(Model model, UserEntity user) {
		log.info("User: "+ user);
		userService.updateUser(user);
		return "redirect:/users";
	}
}
